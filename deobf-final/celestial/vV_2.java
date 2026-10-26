package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.glfw.GLFW;

public class vV_2 extends rrJM {
   private vm_3 class_;
   private Qw_1 private_;
   private static QF[] implements_ = new QF[]{
      QF.return_, QF.int_, QF.this_, QF.extends_, QF.d, QF.P, QF.public_, QF.short_, QF.native_, QF.else_, QF.rx, QF.rJ
   };
   private HM finally_;
   private static final rgP_2 else_ = new rgn_3("options.graphics.fabulous").class_(rgF_2.ITALIC);
   private static final rgP_2 synchronized_ = new rgn_3("options.graphics.warning.message", else_, else_);
   private static final rgP_2 return_ = new rgn_3("options.graphics.warning.title").class_(rgF_2.RED);
   private static final rgP_2 public_ = new rgn_3("options.graphics.warning.accept");
   private static final rgP_2 goto_ = new rgn_3("options.graphics.warning.cancel");
   private static final rgP_2 while_ = new rgN_2("\n");
   private rrJX try_ = new rrJX(this, new rrJd_1());
   private List<LZ> instanceof_ = this.new_;
   private LZ throw_;

   @Override
   protected void byte_(LZ var1) {
      if (var1 == this.throw_) {
         QF.public_.class_(this.private_, -1);
         this.native_();
      }
   }

   public vV_2(vm_3 var1, Qw_1 var2) {
      super(new rgn_3("options.videoTitle"));
      this.class_ = var1;
      this.private_ = var2;
      this.finally_ = this.class_.volatile_.new_();
      this.finally_.implements_();
      if (this.private_.case_ == VW.FABULOUS) {
         this.finally_.throws_();
      }
   }

   public static String class_(FP var0) {
      return var0.class_.private_();
   }

   private void class_(rrXi_1 var1, int var2) {
      if (var1.int_) {
         if (var1.class_ == 200) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            this.volatile_.break_(this.class_);
         }

         if (var1.class_ == 201) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            rrJP var3 = new rrJP(this, this.private_);
            this.volatile_.break_(var3);
         }

         if (var1.class_ == 202) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            rrJE var4 = new rrJE(this, this.private_);
            this.volatile_.break_(var4);
         }

         if (var1.class_ == 211) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            rrXa_1 var5 = new rrXa_1(this, this.private_);
            this.volatile_.break_(var5);
         }

         if (var1.class_ == 212) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            rrJs_1 var6 = new rrJs_1(this, this.private_);
            this.volatile_.break_(var6);
         }

         if (var1.class_ == 222) {
            ((Qw_1)this.volatile_.class_[20]).break_();
            rrJS var7 = new rrJS(this, this.private_);
            this.volatile_.break_(var7);
         }

         if (var1.class_ == 231) {
            if (rrbb_3.T() || rrbb_3.t()) {
               rrbb_3.byte_(rrba_3.class_("of.message.shaders.aa1"), rrba_3.class_("of.message.shaders.aa2"));
               return;
            }

            if (rrbb_3.instanceof_()) {
               rrbb_3.byte_(rrba_3.class_("of.message.shaders.gf1"), rrba_3.class_("of.message.shaders.gf2"));
               return;
            }

            ((Qw_1)this.volatile_.class_[20]).break_();
            rrkx_1 var8 = new rrkx_1(this, this.private_);
            this.volatile_.break_(var8);
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, (cm_3)this.volatile_.class_[15], this.extends_, this.package_ / 2, 15, 16777215);
      super.class_(var1, var2, var3, var4);
      this.try_.class_(var1, var2, var3, this.instanceof_);
   }

   @Override
   protected void break_(LZ var1) {
      if (var1 == this.throw_) {
         this.native_();
      }

      this.finally_();
      if (var1 instanceof rrXi_1 var2) {
         this.class_(var2, 1);
      }
   }

   private void finally_() {
      if (this.finally_.catch_()) {
         ArrayList var1 = Lists.newArrayList(new rgS_2[]{synchronized_, while_});
         String var2 = this.finally_.finally_();
         if (var2 != null) {
            var1.add(while_);
            var1.add(new rgn_3("options.graphics.warning.renderer", var2).class_(rgF_2.GRAY));
         }

         String var3 = this.finally_.native_();
         if (var3 != null) {
            var1.add(while_);
            var1.add(new rgn_3("options.graphics.warning.vendor", var3).class_(rgF_2.GRAY));
         }

         String var4 = this.finally_.extends_();
         if (var4 != null) {
            var1.add(while_);
            var1.add(new rgn_3("options.graphics.warning.version", var4).class_(rgF_2.GRAY));
         }

         this.volatile_.break_(new Zq_1(return_, var1, ImmutableList.of(new ZT(public_, var1x -> {
            this.private_.case_ = VW.FABULOUS;
            ((yX_2)QY.instanceof_().class_[8]).throws_();
            this.finally_.throws_();
            this.volatile_.break_(this);
         }), new ZT(goto_, var1x -> {
            this.finally_.case_();
            this.volatile_.break_(this);
         }))));
      }
   }

   private void native_() {
      this.volatile_.v();
      Qg_1 var1 = this.volatile_.else_();
      int var2 = rrWl_1.class_(this.throw_);
      int var3 = rrWl_1.break_(this.throw_);
      int var4 = this.throw_.volatile_ + (var2 - var3);
      int var5 = this.throw_.final_ + var3 / 2;
      GLFW.glfwSetCursorPos(var1.implements_(), (double)var4 * var1.return_(), (double)var5 * var1.return_());
   }

   @Override
   public void v_() {
      this.instanceof_.clear();

      for (int var1 = 0; var1 < implements_.length; var1++) {
         QF var2 = implements_[var1];
         if (var2 != null) {
            int var3 = this.package_ / 2 - 155 + var1 % 2 * 160;
            int var4 = this.int_ / 6 + 21 * (var1 / 2) - 12;
            LZ var5 = this.class_(var2.class_((Qw_1)this.volatile_.class_[20], var3, var4, 150));
            if (var2 == QF.public_) {
               this.throw_ = var5;
            }
         }
      }

      int var6 = this.int_ / 6 + 21 * (implements_.length / 2) - 12;
      int var10 = 0;
      var10 = this.package_ / 2 - 155;
      this.class_(new rrJG(231, var10, var6, rrba_3.class_("of.options.shaders")));
      var10 = this.package_ / 2 - 155 + 160;
      this.class_(new rrJG(202, var10, var6, rrba_3.class_("of.options.quality")));
      var6 += 21;
      var10 = this.package_ / 2 - 155;
      this.class_(new rrJG(201, var10, var6, rrba_3.class_("of.options.details")));
      var10 = this.package_ / 2 - 155 + 160;
      this.class_(new rrJG(212, var10, var6, rrba_3.class_("of.options.performance")));
      var6 += 21;
      var10 = this.package_ / 2 - 155;
      this.class_(new rrJG(211, var10, var6, rrba_3.class_("of.options.animations")));
      var10 = this.package_ / 2 - 155 + 160;
      this.class_(new rrJG(222, var10, var6, rrba_3.class_("of.options.other")));
      var6 += 21;
      this.class_(new rrXi_1(200, this.package_ / 2 - 100, this.int_ / 6 + 168 + 11, jI_2.class_("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.volatile_.class_[20]).break_();
   }
}
