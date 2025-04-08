import { Component, Input } from '@angular/core';
import { Credito } from './credito';

@Component({
  selector: 'app-creditos-table',
  templateUrl: './creditos-table.component.html',
})
export class CreditosTableComponent {
  @Input() creditos: Credito[] = [];
}
