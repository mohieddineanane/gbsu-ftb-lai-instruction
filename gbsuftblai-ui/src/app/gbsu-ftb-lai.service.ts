import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from './../environments/environment';
import template from 'lodash/template';
const apiUrl = environment.apiUrl + '/gbsu-ftb-lai/${inputNumber}'


@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private httpClient: HttpClient) { }
  
   convertNumber(inputNumber: number): Observable<any> {
    const url = template(apiUrl);
    return this.httpClient.get(url({ 'inputNumber': inputNumber }));
  }

}
