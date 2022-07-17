package tdcc.lab.category.ejb3;

import tdcc.lab.category.Category;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CategorySessionBean implements CategoryService {
    public List<Category> all() {
        List<Category> list = new ArrayList<>();
        Category c = new Category();
        c.setCategoryId("FISH");
        c.setName("Fish");
        c.setDescription("<image src=\"../images/fish_icon.gif\"><font size=\"5\" color=\"blue\"> Fish</font>");
        list.add(c);
        return list;
    }
}
