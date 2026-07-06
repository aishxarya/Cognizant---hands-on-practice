import { Component, Input,Output,EventEmitter, OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard implements OnChanges {

  @Input() courseName = '';

  ngOnChanges(changes: SimpleChanges): void {
    console.log('Previous:', changes['courseName']?.previousValue);
    console.log('Current:', changes['courseName']?.currentValue);
  }
}