package celestial;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class rnt_3 extends WindowAdapter {
   rnt_3(rnT_2 var1, JFrame var2, rnv_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!this.id_class.id_case.getAndSet(true)) {
         this.id_break.setTitle("Minecraft server - shutting down!");
         this.id_byte.id_class(true);
         this.id_class.id_case();
      }
   }
}
