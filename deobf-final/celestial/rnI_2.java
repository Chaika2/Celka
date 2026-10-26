package celestial;

import java.util.Vector;
import javax.swing.JList;

public class rnI_2 extends JList<String> {
   private final rnW_2 class_;
   private int break_;

   public rnI_2(rnW_2 var1) {
      this.class_ = var1;
      var1.protected_(this::class_);
   }

   public void class_() {
      if (this.break_++ % 20 == 0) {
         Vector var1 = new Vector();

         for (int var2 = 0; var2 < this.class_.x().super_().size(); var2++) {
            var1.add(this.class_.x().super_().get(var2).sv().getName());
         }

         this.setListData(var1);
      }
   }
}
