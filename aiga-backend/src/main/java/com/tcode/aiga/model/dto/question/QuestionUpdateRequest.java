package com.tcode.aiga.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新题目请求
 *
 * @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
 * @from <a href="https://tanjiahe.icu">个人博客</a>
 */
@Data
public class QuestionUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题目内容（json格式）
     */
    private List<QuestionContentDTO> questionContent;

    private static final long serialVersionUID = 1L;
}