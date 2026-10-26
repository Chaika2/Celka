package celestial;

import java.util.Vector;
import javax.swing.JList;

public class rnI_2 extends JList<String> {
   private final rnW_2 id_class;
   private int id_break;

   public rnI_2(rnW_2 var1) {
      this.id_class = var1;
      var1.id_protected(this::id_class);
   }

   public void id_class() {
      if (this.id_break++ % 20 == 0) {
         Vector var1 = new Vector();

         for (int var2 = 0; var2 < this.id_class.x().id_super().size(); var2++) {
            var1.add(this.id_class.x().id_super().get(var2).sv().getName());
         }

         this.setListData(var1);
      }
   }
}
