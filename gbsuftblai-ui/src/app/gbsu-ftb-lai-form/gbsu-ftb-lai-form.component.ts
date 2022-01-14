import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {


  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
  this.gbsuFormOutput.emit(this.gbsuForm.get('inputNumber').value);
  }
  
  @Output()
  gbsuFormOutput = new EventEmitter<number>();
  gbsuForm = new FormGroup({
    inputNumber: new FormControl('', { validators: [
      Validators.required,
      Validators.pattern(/^[0-9]*$/)
      ]
    })
  });

}
