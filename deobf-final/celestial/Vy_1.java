package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class Vy_1 implements AutoCloseable {
   private final VT byte_;
   public final VC class_;
   public final VC break_;
   private final List<IntSupplier> protected_ = Lists.newArrayList();
   private final List<String> throws_ = Lists.newArrayList();
   private final List<Integer> case_ = Lists.newArrayList();
   private final List<Integer> catch_ = Lists.newArrayList();
   private rjV_2 private_;

   public Vy_1(rAL var1, String var2, VC var3, VC var4) throws IOException {
      this.byte_ = new VT(var1, var2);
      this.class_ = var3;
      this.break_ = var4;
   }

   public void class_(rjV_2 var1) {
      this.private_ = var1;
   }

   public void class_(float var1) {
      this.class_.throws_();
      float var2 = (float)this.break_.class_;
      float var3 = (float)this.break_.break_;
      RenderSystem.viewport(0, 0, (int)var2, (int)var3);
      this.byte_.class_("DiffuseSampler", this.class_::case_);

      for (int var4 = 0; var4 < this.protected_.size(); var4++) {
         this.byte_.class_(this.throws_.get(var4), this.protected_.get(var4));
         this.byte_.break_("AuxSize" + var4).class_((float)this.case_.get(var4).intValue(), (float)this.catch_.get(var4).intValue());
      }

      this.byte_.break_("ProjMat").class_(this.private_);
      this.byte_.break_("InSize").class_((float)this.class_.class_, (float)this.class_.break_);
      this.byte_.break_("OutSize").class_(var2, var3);
      this.byte_.break_("Time").class_(var1);
      QY var8 = QY.instanceof_();
      this.byte_.break_("ScreenSize").class_((float)var8.else_().extends_(), (float)var8.else_().native_());
      this.byte_.case_();
      this.break_.break_((Boolean)QY.break_[2]);
      this.break_.class_(false);
      RenderSystem.depthFunc(519);
      lD_2 var5 = yb_3.class_().byte_();
      var5.class_(7, ju_3.this_);
      var5.class_(0.0, 0.0, 500.0).break_(255, 255, 255, 255).class_();
      var5.class_((double)var2, 0.0, 500.0).break_(255, 255, 255, 255).class_();
      var5.class_((double)var2, (double)var3, 500.0).break_(255, 255, 255, 255).class_();
      var5.class_(0.0, (double)var3, 500.0).break_(255, 255, 255, 255).class_();
      var5.finally_();
      yk_3.class_(var5);
      RenderSystem.depthFunc(515);
      this.byte_.throws_();
      this.break_.throws_();
      this.class_.protected_();

      for (Object var7 : this.protected_) {
         if (var7 instanceof VC) {
            ((VC)var7).protected_();
         }
      }
   }

   public VT class_() {
      return this.byte_;
   }

   public void class_(String var1, IntSupplier var2, int var3, int var4) {
      this.throws_.add(this.throws_.size(), var1);
      this.protected_.add(this.protected_.size(), var2);
      this.case_.add(this.case_.size(), var3);
      this.catch_.add(this.catch_.size(), var4);
   }

   @Override
   public void close() {
      this.byte_.close();
   }
}
