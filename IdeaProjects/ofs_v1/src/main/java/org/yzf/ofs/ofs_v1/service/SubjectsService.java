package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.mapper.SubjectsMapper;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Map;

@Service
public class SubjectsService {
    @Autowired
    SubjectsMapper subjectsMapper;

    public List<Subjects> getAllSubjects()
    {
        List<Subjects> list = subjectsMapper.getAllSubjects();
        return list;
    }

    public int addSubjectsOne(Subjects subjects)
    {
       return subjectsMapper.addSubjectsOne(subjects);
    }

    public int addSubjectsSelective(Subjects subjects)
    {
        return subjectsMapper.addSubjectsSelective(subjects);
    }

    public void addSubject(Subjects subject)
    {
        subjectsMapper.addSubject(subject);
    }

    public int addSubjects(List<Subjects> subjects)
    {
        return subjectsMapper.addSubjects(subjects);
    }

    public int insSubjects(Subjects subjects) throws DataAccessException
    {
        return subjectsMapper.insSubjects(subjects);
    }

    public int updSubjects(Subjects subjects) throws DataAccessException
    {
        return subjectsMapper.updSubjects(subjects);
    }

    public int delSubjects(Subjects subjects) throws DataAccessException
    {
        return subjectsMapper.delSubjects(subjects);
    }

    public List<Subjects>  selectAll()
    {
        List<Subjects>  retlist = subjectsMapper.selectAll();
        return retlist;
    }

    public Subjects selectByID(Integer subjectsId) {

        Subjects ret=subjectsMapper.selectById(subjectsId);

        return ret;
    }

    public List<Subjects> selectByName(String subjectsName)
    {
        return subjectsMapper.selectByName(subjectsName);
    }

    public List<Subjects>  selectSub(Subjects subjects)
    {
        List<Subjects>  retlist = subjectsMapper.selectSub(subjects);
        return retlist;
    }

    public int deleteById(Integer subjectsId)
    {
        return subjectsMapper.deleteById(subjectsId);
    }
    public int updateById(Subjects subjects)
    {
        return subjectsMapper.updateById(subjects);
    }

}
