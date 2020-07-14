import { Injectable } from '@angular/core';
import { Test } from './test';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestService {
  private testUrl:string;
  private testSubmitUrl:string;
  public static results:number[] = [];
  constructor(private http:HttpClient) {
    this.testUrl = "http://localhost:5000/test"
    this.testSubmitUrl = "http://localhost:5000/test/submit"
   }
   public getNewTest():Observable<Test>{
     return this.http.get<Test>(this.testUrl);
   }
   public submitTest(test:Test){
     return this.http.post<number>(this.testSubmitUrl,test);
   }
   public getResults(){
    return TestService.results;
   }
   public pushResult(res:number){
        TestService.results.push(res);
    }
}
