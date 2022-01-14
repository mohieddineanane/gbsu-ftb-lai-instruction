import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html',
  styleUrls: ['./gbsu-ftb-lai.component.css']
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  numbersConverted: NumberConverted[] = [];
  
  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
  this.gbsuFtbLaiService.convertNumber(inputNumber)
    .subscribe(
      response => {
        const numberConverted: NumberConverted = {numberToConvert: inputNumber, result: response.result};
        this.numbersConverted.push(numberConverted);
      },
      error => {
        console.log("error :", error);
      }
    );
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
