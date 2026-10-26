package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Lx_1 implements LE, LS {
   private static final rgP_2 id_class = new rgn_3("spectatorMenu.team_teleport");
   private static final rgP_2 id_break = new rgn_3("spectatorMenu.team_teleport.prompt");
   private final List<LS> id_byte = Lists.newArrayList();

   @Override
   public rgP_2 id_byte() {
      return id_class;
   }

   public Lx_1() {
      QY var1 = QY.id_instanceof();

      for (rnB_2 var3 : ((gm_3)var1.id_class[56]).id_package().id_throws()) {
         this.id_byte.add(new Ld_1(this, var3));
      }
   }

   @Override
   public void id_class(Ml_1 var1, float var2, int var3) {
      QY.id_instanceof().A().id_class(cY_2.id_class);
      ch_3.id_class(var1, 0, 0, 16.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public List<LS> id_class() {
      return this.id_byte;
   }

   @Override
   public void id_class(Lb_1 var1) {
      var1.id_class(this);
   }

   @Override
   public rgP_2 id_break() {
      return id_break;
   }

   @Override
   public boolean id_protected() {
      for (LS var2 : this.id_byte) {
         if (var2.id_protected()) {
            return true;
         }
      }

      return false;
   }
}
