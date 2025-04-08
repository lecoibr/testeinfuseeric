# Etapa de build
FROM node:18 as build
WORKDIR /app
COPY . .
RUN npm install -g @angular/cli && npm install && ng build --configuration production

# Etapa de produção
FROM nginx:alpine
COPY --from=build /app/dist/* /usr/share/nginx/html
EXPOSE 80
