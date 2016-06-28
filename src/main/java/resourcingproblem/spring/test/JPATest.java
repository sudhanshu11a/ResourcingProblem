package resourcingproblem.spring.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import resourcingproblem.spring.entities.MasterSkillEntity;

public class JPATest {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ResourcingProblem");
    EntityManager entityManager = factory.createEntityManager();

	  public static void main(String[] args) {
		  JPATest example = new JPATest();
	    System.out.println("After Sucessfully insertion ");
	    MasterSkillEntity masterSkillEntity1 = example.saveMasterSkill("Oracle");
	    MasterSkillEntity masterSkillEntity2 = example.saveMasterSkill("Java");
	    example.listStudent();
	    System.out.println("After Sucessfully deletion ");
	   // example.deleteStudent(student2.getStudentId());
	   

	  }

	  public MasterSkillEntity saveMasterSkill(String name) {
		  MasterSkillEntity masterSkillEntity = new MasterSkillEntity();
	    try {
	      entityManager.getTransaction().begin();
	      masterSkillEntity.setName(name);
	      masterSkillEntity = entityManager.merge(masterSkillEntity);
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	    return masterSkillEntity;
	  }

	  public void listStudent() {
	    try {
	      entityManager.getTransaction().begin();
	      List<MasterSkillEntity> masterSkillEntities = entityManager.createQuery("from master_skill").getResultList();
	      for (Iterator<MasterSkillEntity> iterator = masterSkillEntities.iterator(); iterator.hasNext();) {
	    	  MasterSkillEntity masterSkillEntity = (MasterSkillEntity) iterator.next();
	        System.out.println(masterSkillEntity.getName());
	      }
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	  }

	 /* public void deleteStudent(Long studentId) {
	    try {
	      entityManager.getTransaction().begin();
	      Student student = (Student) entityManager.find(Student.class, studentId);
	      entityManager.remove(student);
	      entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      entityManager.getTransaction().rollback();
	    }
	  }*/
	}
