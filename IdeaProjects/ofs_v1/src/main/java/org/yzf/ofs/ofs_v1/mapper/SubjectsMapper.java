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

    int addSubjectsOne(Subjects subjects);

    int addSubjectsSelective(Subjects subjects);

    @Select({ "select * from  ofs_subjects " })
    List<Subjects> selectAll();

    @Select("select * from  ofs_subjects where subjects_id=#{subjectsId}")
    @Results({
            @Result(property = "subjectsId", column = "SUBJECTS_ID"),
            @Result(property = "subjectsName", column = "SUBJECTS_NAME"),
            @Result(property = "subjectsRem", column = "SUBJECTS_REM")})
    Subjects selectById(Integer subjectsId);

    @Select({ "select * from  ofs_subjects where subjects_name like CONCAT('%',#{subjectsName},'%')" })
    @Results({
            @Result(property = "subjectsId", column = "SUBJECTS_ID"),
            @Result(property = "subjectsName", column = "SUBJECTS_NAME"),
            @Result(property = "subjectsRem", column = "SUBJECTS_REM")})
    List<Subjects> selectByName(String subjectsName);

    @Select({ "select * from  ofs_subjects where subjects_name like CONCAT('%',#{subjectsName},'%')" })
    List<Subjects> selectSub(Subjects subjects);

    @Insert({ "insert into ofs_subjects values (#{subjectsId},#{subjectsName},#{subjectsRem}) " })
    int insSubjects(Subjects subjects);

    @Update({ "update ofs_subjects set subjects_id=#{subjectsId},subjects_name = #{subjectsName},subjects_rem=#{subjectsRem} " +
            "where subjects_id = #{subjectsId}"})
    int updSubjects(Subjects subjects);

    @Delete({ "Delete from ofs_subjects  " +
            "where subjects_id = #{subjectsId}"})
    int delSubjects(Subjects subjects);

    @Delete({ "Delete from ofs_subjects  " +
            "where subjects_id = #{subjectsId}"})
    int deleteById(Integer subjectsId);

    @Update({ "update ofs_subjects set subjects_id=#{subjectsId},subjects_name = #{subjectsName},subjects_rem=#{subjectsRem} " +
            "where subjects_id = #{subjectsId}"})
    int updateById(Subjects subjects);
}

