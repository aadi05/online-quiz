import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';

@Component({
  selector: 'app-results',
  templateUrl: './results.component.html',
  styleUrls: ['./results.component.css']
})
export class ResultsComponent implements OnInit {
  private results:number[] = [];
  constructor(private service:TestService) {
   }

  ngOnInit() {
    this.results = this.service.getResults();
  }

}
