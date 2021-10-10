package com.kibria.user.VO;

import com.kibria.user.entity.User;
import lombok.Data;

@Data
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
