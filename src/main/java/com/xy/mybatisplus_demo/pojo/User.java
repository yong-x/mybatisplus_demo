package com.xy.mybatisplus_demo.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*
    * @TableId 用于指定插入数据库时，如果不显式指定主键id的值，主键的生成策略。
    * ID_WORKER:    默认值主键生成策略类型，表示使用雪花算法生成全局唯一id。
    * AUTO：         自增主键生成策略类型，表示由数据库维护自增序列，框架不做干预，需要在数据库中配置主键为自增列。
    * INPUT：        用户在插入数据时手动设置ID,该类型可以通过自己注册自动填充插件进行填充
    * NONE：        数据表未设置主键id，用得比较少。
    以下3种类型、只有当插入对象ID 为空（null），才自动填充。
    ID_WORKER:  基于雪花算法的全局唯一ID (idWorker)
    UUID(4):    基于UUID的全局唯一ID (UUID)
    ID_WORKER_STR(5)：   字符串全局唯一ID (idWorker 的字符串表示)
    * */
    @TableId(type = IdType.AUTO)
    //@TableId(type = IdType.ID_WORKER)
    private Long id; //如果用雪花算法生成id，这里一定要用Long类型，否则长度不够
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT) //在插入操作时，该属性自动填充，可以自定义属性填充策略
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)//在插入和更新操作时，该属性自动填充，可以自定义属性填充策略
    private Date updateTime;
}
