package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class Vy_1 implements AutoCloseable {
   private final VT id_byte;
   public final VC id_class;
   public final VC id_break;
   private final List<IntSupplier> id_protected = Lists.newArrayList();
   private final List<String> id_throws = Lists.newArrayList();
   private final List<Integer> id_case = Lists.newArrayList();
   private final List<Integer> id_catch = Lists.newArrayList();
   private rjV_2 id_private;

   public Vy_1(rAL var1, String var2, VC var3, VC var4) throws IOException {
      this.id_byte = new VT(var1, var2);
      this.id_class = var3;
      this.id_break = var4;
   }

   public void id_class(rjV_2 var1) {
      this.id_private = var1;
   }

   public void id_class(float var1) {
      this.id_class.id_throws();
      float var2 = (float)this.id_break.id_class;
      float var3 = (float)this.id_break.id_break;
      RenderSystem.viewport(0, 0, (int)var2, (int)var3);
      this.id_byte.id_class("DiffuseSampler", this.id_class::id_case);

      for (int var4 = 0; var4 < this.id_protected.size(); var4++) {
         this.id_byte.id_class(this.id_throws.get(var4), this.id_protected.get(var4));
         this.id_byte.id_break("AuxSize" + var4).id_class((float)this.id_case.get(var4).intValue(), (float)this.id_catch.get(var4).intValue());
      }

      this.id_byte.id_break("ProjMat").id_class(this.id_private);
      this.id_byte.id_break("InSize").id_class((float)this.id_class.id_class, (float)this.id_class.id_break);
      this.id_byte.id_break("OutSize").id_class(var2, var3);
      this.id_byte.id_break("Time").id_class(var1);
      QY var8 = QY.id_instanceof();
      this.id_byte.id_break("ScreenSize").id_class((float)var8.id_else().id_extends(), (float)var8.id_else().id_native());
      this.id_byte.id_case();
      this.id_break.id_break((Boolean)QY.id_break[2]);
      this.id_break.id_class(false);
      RenderSystem.depthFunc(519);
      lD_2 var5 = yb_3.id_class().id_byte();
      var5.id_class(7, ju_3.id_this);
      var5.id_class(0.0, 0.0, 500.0).id_break(255, 255, 255, 255).id_class();
      var5.id_class((double)var2, 0.0, 500.0).id_break(255, 255, 255, 255).id_class();
      var5.id_class((double)var2, (double)var3, 500.0).id_break(255, 255, 255, 255).id_class();
      var5.id_class(0.0, (double)var3, 500.0).id_break(255, 255, 255, 255).id_class();
      var5.id_finally();
      yk_3.id_class(var5);
      RenderSystem.depthFunc(515);
      this.id_byte.id_throws();
      this.id_break.id_throws();
      this.id_class.id_protected();

      for (Object var7 : this.id_protected) {
         if (var7 instanceof VC) {
            ((VC)var7).id_protected();
         }
      }
   }

   public VT id_class() {
      return this.id_byte;
   }

   public void id_class(String var1, IntSupplier var2, int var3, int var4) {
      this.id_throws.add(this.id_throws.size(), var1);
      this.id_protected.add(this.id_protected.size(), var2);
      this.id_case.add(this.id_case.size(), var3);
      this.id_catch.add(this.id_catch.size(), var4);
   }

   @Override
   public void close() {
      this.id_byte.close();
   }
}
