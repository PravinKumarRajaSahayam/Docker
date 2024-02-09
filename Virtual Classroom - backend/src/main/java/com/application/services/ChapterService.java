package com.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.application.model.Chapter;
import com.application.repository.ChapterRepository;

@Service
public class ChapterService 
{
	@Autowired
	private ChapterRepository chapterRepo;
	
	public String saveChapter(Chapter chapter)
	{
		chapterRepo.save(chapter);
		return "Chapter saved";
	}
	
	public String addNewChapter(Chapter chapter)
	{
		chapterRepo.save(chapter);
		return "Chapter Added";
	}
	
	public List<Chapter> getAllChapters()
	{
		return (List<Chapter>)chapterRepo.findAll();
	}
	
	public List<Chapter> fetchByCoursename(String coursename)
	{
		return (List<Chapter>)chapterRepo.findByCoursename(coursename);
	}
}