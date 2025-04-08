import { Component } from '@angular/core';
import { CreditoService } from './credito.service';
import { Credito } from './credito';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
})
export class SearchComponent {
  numero: string = '';
  tipoBusca: 'nfse' | 'credito' = 'nfse';
  resultados: Credito[] = [];

  constructor(private creditoService: CreditoService) {}

  buscar() {
    if (!this.numero.trim()) return;

    if (this.tipoBusca === 'nfse') {
      this.creditoService.getByNfse(this.numero).subscribe(data => this.resultados = data);
    } else {
      this.creditoService.getByCredito(this.numero).subscribe(data => this.resultados = [data]);
    }
  }
}
