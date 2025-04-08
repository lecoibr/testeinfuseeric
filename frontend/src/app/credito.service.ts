import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Credito } from './credito';

@Injectable({ providedIn: 'root' })
export class CreditoService {
  private apiUrl = 'http://localhost:8080/api/creditos';

  constructor(private http: HttpClient) {}

  getByNfse(numero: string): Observable<Credito[]> {
    return this.http.get<Credito[]>(`${this.apiUrl}/${numero}`);
  }

  getByCredito(numero: string): Observable<Credito> {
    return this.http.get<Credito>(`${this.apiUrl}/credito/${numero}`);
  }
}
