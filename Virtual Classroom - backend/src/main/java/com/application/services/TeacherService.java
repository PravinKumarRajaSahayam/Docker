package com.application.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.model.Teacher;
import com.application.repository.TeacherRepository;

@Service
public class TeacherService 
{
	@Autowired
	private TeacherRepository teacherRepo;
	
	public String saveTeacher(Teacher teacher)
	{
		teacherRepo.save(teacher);
		return "Registered Successfully";
	}
	
	public String addNewTeacher(Teacher teacher)
	{
		teacherRepo.save(teacher);
		return "Add Successfully";
	}
	
	public String updateteacherProfile(Teacher teacher)
	{
		teacherRepo.save(teacher);
		return "Updated Successfully";
	}
	
	public List<Teacher> getAllTeachers()
	{
		return (List<Teacher>)teacherRepo.findAll();
	}
	
	public List<Teacher> getTeacherListByEmail(String email) 
	{
		return (List<Teacher>)teacherRepo.findTeacherListByEmail(email);
	}
	
	public Teacher fetchTeacherByEmail(String email)
	{
		return teacherRepo.findByEmail(email);
	}
	
	public Teacher fetchTeacherByTeachername(String teachername)
	{
		return teacherRepo.findByTeachername(teachername);
	}
	
	public String fetchTeacherByEmailAndPassword(String email, String password)
	{
		teacherRepo.findByEmailAndPassword(email, password);
		return "Login Successfully";
	}
	
	public List<Teacher> fetchProfileByEmail(String email)
	{
		return (List<Teacher>)teacherRepo.findProfileByEmail(email);
	}

	public String updateStatus(String email) 
	{
		teacherRepo.updateStatus(email);
		return "accept";
	}

	public String rejectStatus(String email) 
	{
		teacherRepo.rejectStatus(email);
		return "reject";
	}

	public List<Teacher> getteachersByEmail(String email)
	{
		return teacherRepo.findTeacherListByEmail(email);
	}
}