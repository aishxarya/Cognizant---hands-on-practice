import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList 
implements OnInit {

courses = [
  { id: 1, name: 'Angular', code: 'ANG101', credits: 4 },
  { id: 2, name: 'Java', code: 'JAVA101', credits: 3 },
  { id: 3, name: 'Python', code: 'PY101', credits: 3 }
];
selectedCourseId?: number;

onEnroll(courseId: number) {
  console.log('Enrolling in course: ' + courseId);
  this.selectedCourseId = courseId;
}
}
