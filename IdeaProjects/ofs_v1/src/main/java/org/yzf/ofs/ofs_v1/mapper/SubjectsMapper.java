package org.yzf.ofs.ofs_v1.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.Subjects;

import java.util.List;
import java.util.Map;

@Repository
public interface SubjectsMapper {

    List<Subjects> getAllSubjects();

    void addSubject(Subjects subject);

    int addSubjects(List<Subjects> subjects);

    @Select({ "select * from  ofs_subjects " })
    List<Map<Object,Object>> selectAll();

    @Select({ "select * from  ofs_subjects where subjects_id=#{subjectsId}" })
    Map<Object,Object> selectOne(Subjects subjects);

    @Select({ "select subjects_id,subjects_name,subjects_rem from  ofs_subjects where subjects_id=#{subjectsId}" })
    List<Map<Object,Object>>  selectOne1(Subjects subjects);

    @Insert({ "insert into ofs_subjects values (#{subjectsId},#{subjectsName},#{subjectsRem}) " })
    int insSubjects(Subjects subjects);

    @Update({ "update ofs_subjects set subjects_id=#{subjectsId},subjects_name = #{subjectsName},subjects_rem=#{subjectsRem} " +
            "where subjects_id = #{subjectsId}"})
    int updSubjects(Subjects subjects);

    @Delete({ "Delete from ofs_subjects  " +
            "where subjects_id = #{subjectsId}"})
    int delSubjects(Subjects subjects);
}
