import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { DataInterface } from './interface/data-interface';

@Injectable({
  providedIn: 'root'
})
export class SharedDataService {
  private data: BehaviorSubject<DataInterface> = new BehaviorSubject<DataInterface>({});
  constructor() {
    
  }
}
