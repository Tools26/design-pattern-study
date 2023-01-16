from observer import Student
from subject import ProfessorK

professor = ProfessorK()

student = []

for _ in range(5):
    student.append(Student())
    professor.attach(student[-1])

professor.setState(False)

for _ in range(2):
    a = student.pop()
    professor.detach(a)

professor.setState(True)