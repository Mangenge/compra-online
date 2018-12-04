package net.gm.compraonlinebackend.dao;

import java.util.List;

import net.gm.compraonlinebackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
