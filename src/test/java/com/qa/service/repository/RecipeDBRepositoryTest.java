//package com.qa.service.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import com.qa.persistence.domain.Recipe;
//import com.qa.persistence.repository.RecipeDBRepository;
//import com.qa.util.JSONUtil;
//
//@RunWith(MockitoJUnitRunner.class)
//public class RecipeDBRepositoryTest {
//	
//	@InjectMocks
//	private RecipeDBRepository repo;
//
//	@Mock
//	private EntityManager manager;
//
//	@Mock
//	private Query query;
//
//	private JSONUtil util;
//
//
//	private static final String MOCK_DATA_ARRAY = "[{\"name\":\"Carrot Cake\",\"rating\":\"5\"}]";
//
//	private static final String MOCK_OBJECT = "{\"name\":\"Carrot Cake\",\"rating\":\"5\"}";
//
//	@Before
//	public void setup() {
//		repo.setManager(manager);
//		util = new JSONUtil();
//		repo.setUtil(util);
//	}
//
//	@Ignore
//	@Test
//	public void testGetAllRecipes() {
//		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
//		List<Recipe> recipes = new ArrayList<Recipe>();
//		recipes.add(new Recipe("Carrot Cake", 5));
//		Mockito.when(query.getResultList()).thenReturn(recipes);
//		System.out.println(repo.getAllRecipes());
//		Assert.assertEquals(MOCK_DATA_ARRAY, repo.getAllRecipes());
//	}
//
//	@Ignore
//	@Test
//	public void testCycleRecipes() {
//
//		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
//		List<Recipe> recipes = new ArrayList<Recipe>();
//		recipes.add(new Recipe("Carrot", 5));
//		Mockito.when(query.getResultList()).thenReturn(recipes);
//		Assert.assertEquals(1, repo.cycleRecipes("Alien"));
//
//	}
//
//	@Ignore
//	@Test
//	public void testCreateRecipe() {
//		String reply = repo.createRecipe(MOCK_OBJECT);
//		Assert.assertEquals(reply, "{\"message\": \"recipe has been sucessfully added\"}");
//	}
//
//	@Ignore
//	@Test
//	public void testDeleteRecipe() {
//		String reply = repo.deleteRecipe(1L);
//		Assert.assertEquals(reply, "{\"message\": \"recipe sucessfully deleted\"}");
//	}
//}
