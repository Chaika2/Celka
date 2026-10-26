package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.glfw.GLFW;

public class vV_2 extends rrJM {
   private vm_3 id_class;
   private Qw_1 id_private;
   private static QF[] id_implements = new QF[]{
      QF.id_return, QF.id_int, QF.id_this, QF.id_extends, QF.d, QF.P, QF.id_public, QF.id_short, QF.id_native, QF.id_else, QF.rx, QF.rJ
   };
   private HM id_finally;
   private static final rgP_2 id_else = new rgn_3("options.graphics.fabulous").id_class(rgF_2.ITALIC);
   private static final rgP_2 id_synchronized = new rgn_3("options.graphics.warning.message", id_else, id_else);
   private static final rgP_2 id_return = new rgn_3("options.graphics.warning.title").id_class(rgF_2.RED);
   private static final rgP_2 id_public = new rgn_3("options.graphics.warning.accept");
   private static final rgP_2 id_goto = new rgn_3("options.graphics.warning.cancel");
   private static final rgP_2 id_while = new rgN_2("\n");
   private rrJX id_try = new rrJX(this, new rrJd_1());
   private List<LZ> id_instanceof = this.id_new;
   private LZ id_throw;

   @Override
   protected void id_byte(LZ var1) {
      if (var1 == this.id_throw) {
         QF.id_public.id_class(this.id_private, -1);
         this.id_native();
      }
   }

   public vV_2(vm_3 var1, Qw_1 var2) {
      super(new rgn_3("options.videoTitle"));
      this.id_class = var1;
      this.id_private = var2;
      this.id_finally = this.id_class.id_volatile.id_new();
      this.id_finally.id_implements();
      if (this.id_private.id_case == VW.FABULOUS) {
         this.id_finally.id_throws();
      }
   }

   public static String id_class(FP var0) {
      return var0.id_class.id_private();
   }

   private void id_class(rrXi_1 var1, int var2) {
      if (var1.id_int) {
         if (var1.id_class == 200) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            this.id_volatile.id_break(this.id_class);
         }

         if (var1.id_class == 201) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrJP var3 = new rrJP(this, this.id_private);
            this.id_volatile.id_break(var3);
         }

         if (var1.id_class == 202) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrJE var4 = new rrJE(this, this.id_private);
            this.id_volatile.id_break(var4);
         }

         if (var1.id_class == 211) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrXa_1 var5 = new rrXa_1(this, this.id_private);
            this.id_volatile.id_break(var5);
         }

         if (var1.id_class == 212) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrJs_1 var6 = new rrJs_1(this, this.id_private);
            this.id_volatile.id_break(var6);
         }

         if (var1.id_class == 222) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrJS var7 = new rrJS(this, this.id_private);
            this.id_volatile.id_break(var7);
         }

         if (var1.id_class == 231) {
            if (rrbb_3.T() || rrbb_3.t()) {
               rrbb_3.id_byte(rrba_3.id_class("of.message.shaders.aa1"), rrba_3.id_class("of.message.shaders.aa2"));
               return;
            }

            if (rrbb_3.id_instanceof()) {
               rrbb_3.id_byte(rrba_3.id_class("of.message.shaders.gf1"), rrba_3.id_class("of.message.shaders.gf2"));
               return;
            }

            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            rrkx_1 var8 = new rrkx_1(this, this.id_private);
            this.id_volatile.id_break(var8);
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, (cm_3)this.id_volatile.id_class[15], this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
      this.id_try.id_class(var1, var2, var3, this.id_instanceof);
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 == this.id_throw) {
         this.id_native();
      }

      this.id_finally();
      if (var1 instanceof rrXi_1 var2) {
         this.id_class(var2, 1);
      }
   }

   private void id_finally() {
      if (this.id_finally.id_catch()) {
         ArrayList var1 = Lists.newArrayList(new rgS_2[]{id_synchronized, id_while});
         String var2 = this.id_finally.id_finally();
         if (var2 != null) {
            var1.add(id_while);
            var1.add(new rgn_3("options.graphics.warning.renderer", var2).id_class(rgF_2.GRAY));
         }

         String var3 = this.id_finally.id_native();
         if (var3 != null) {
            var1.add(id_while);
            var1.add(new rgn_3("options.graphics.warning.vendor", var3).id_class(rgF_2.GRAY));
         }

         String var4 = this.id_finally.id_extends();
         if (var4 != null) {
            var1.add(id_while);
            var1.add(new rgn_3("options.graphics.warning.version", var4).id_class(rgF_2.GRAY));
         }

         this.id_volatile.id_break(new Zq_1(id_return, var1, ImmutableList.of(new ZT(id_public, var1x -> {
            this.id_private.id_case = VW.FABULOUS;
            ((yX_2)QY.id_instanceof().id_class[8]).id_throws();
            this.id_finally.id_throws();
            this.id_volatile.id_break(this);
         }), new ZT(id_goto, var1x -> {
            this.id_finally.id_case();
            this.id_volatile.id_break(this);
         }))));
      }
   }

   private void id_native() {
      this.id_volatile.v();
      Qg_1 var1 = this.id_volatile.id_else();
      int var2 = rrWl_1.id_class(this.id_throw);
      int var3 = rrWl_1.id_break(this.id_throw);
      int var4 = this.id_throw.id_volatile + (var2 - var3);
      int var5 = this.id_throw.id_final + var3 / 2;
      GLFW.glfwSetCursorPos(var1.id_implements(), (double)var4 * var1.id_return(), (double)var5 * var1.id_return());
   }

   @Override
   public void v_() {
      this.id_instanceof.clear();

      for (int var1 = 0; var1 < id_implements.length; var1++) {
         QF var2 = id_implements[var1];
         if (var2 != null) {
            int var3 = this.id_package / 2 - 155 + var1 % 2 * 160;
            int var4 = this.id_int / 6 + 21 * (var1 / 2) - 12;
            LZ var5 = this.id_class(var2.id_class((Qw_1)this.id_volatile.id_class[20], var3, var4, 150));
            if (var2 == QF.id_public) {
               this.id_throw = var5;
            }
         }
      }

      int var6 = this.id_int / 6 + 21 * (id_implements.length / 2) - 12;
      int var10 = 0;
      var10 = this.id_package / 2 - 155;
      this.id_class(new rrJG(231, var10, var6, rrba_3.id_class("of.options.shaders")));
      var10 = this.id_package / 2 - 155 + 160;
      this.id_class(new rrJG(202, var10, var6, rrba_3.id_class("of.options.quality")));
      var6 += 21;
      var10 = this.id_package / 2 - 155;
      this.id_class(new rrJG(201, var10, var6, rrba_3.id_class("of.options.details")));
      var10 = this.id_package / 2 - 155 + 160;
      this.id_class(new rrJG(212, var10, var6, rrba_3.id_class("of.options.performance")));
      var6 += 21;
      var10 = this.id_package / 2 - 155;
      this.id_class(new rrJG(211, var10, var6, rrba_3.id_class("of.options.animations")));
      var10 = this.id_package / 2 - 155 + 160;
      this.id_class(new rrJG(222, var10, var6, rrba_3.id_class("of.options.other")));
      var6 += 21;
      this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
   }
}
