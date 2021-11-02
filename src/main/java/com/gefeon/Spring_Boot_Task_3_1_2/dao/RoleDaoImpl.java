package com.gefeon.Spring_Boot_Task_3_1_2.dao;

import com.gefeon.Spring_Boot_Task_3_1_2.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public List<Role> listRoles() {
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }

    @Override
    public Role getRole(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Role getRole(String role) {
        return entityManager.createQuery("select r from Role r where r.role=:role",
                Role.class).setParameter("role", role).getSingleResult();
    }
}
