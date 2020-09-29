
package Model;

import javax.swing.table.DefaultTableModel;


public interface IProductoDao {
    
    public int AddProduct(ProductoEntity producto);

    public DefaultTableModel Reed();
    
    public int Update(ProductoEntity producto);
    
    public int Delete(int idproducto);

    
}
