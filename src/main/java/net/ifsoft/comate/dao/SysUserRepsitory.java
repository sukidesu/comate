package net.ifsoft.comate.dao;


import net.ifsoft.comate.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepsitory extends JpaRepository<SysUser,Long> {
}
