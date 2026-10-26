package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class yb_3 {
   private final lD_2 id_class;
   private static final yb_3 id_break = new yb_3();

   public lD_2 id_byte() {
      return this.id_class;
   }

   public yb_3(int var1) {
      this.id_class = new lD_2(var1);
   }

   public yb_3() {
      this(2097152);
   }

   public void id_class(lD_2 var1) {
      if (var1.id_finally != null) {
         rrMh_1.id_class(var1.id_finally);
      }

      var1.id_finally();
      yk_3.id_class(var1);
   }

   public static yb_3 id_class() {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      return id_break;
   }

   public void id_break() {
      this.id_class(this.id_class);
   }
}
