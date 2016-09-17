function student(name, prereq, courses_completed, courses_enrolled) {
	this.name = name;
	this.prereq = prereq;
	this.courses_completed = courses_completed;
	this.courses_enrolled = courses_enrolled;
}

student.prototype.is_course_completed = function(course_number) {
	return this.courses_completed.indexOf(course_number) > -1 ;
}

student.prototype.enroll_in_course = function(course_number) {
	if (this.is_course_completed(202) && !this.prereq) {
		this.courses_enrolled.push(course_number);
		console.log(this.name+ " has met the prerequisites.");
		console.log(this.name+" successfully enrolled into course # "+course_number);
	}
}

var rakesh = new student("Rakesh", false, [202,272], []);

console.log("Courses completed by "+rakesh.name+ " "+rakesh.courses_completed);
console.log("Rakesh is trying to enroll for 273");
rakesh.enroll_in_course(273);