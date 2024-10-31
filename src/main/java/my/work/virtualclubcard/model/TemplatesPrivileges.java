package my.work.virtualclubcard.model;

import lombok.Data;

@Data
public class TemplatesPrivileges {
    private Long id;
    private Template template;
    private PrivilegeLevel privilegeLevel;
}
