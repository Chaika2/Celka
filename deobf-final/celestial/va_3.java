package celestial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class va_3 extends LV<vi_3> {
   static final Logger throws_ = LogManager.getLogger();
   static final DateFormat case_ = new SimpleDateFormat();
   static final rqO_2 catch_ = new rqO_2("textures/misc/unknown_server.png");
   public static final rqO_2 class_ = new rqO_2("textures/gui/world_selection.png");
   static final rgP_2 private_ = new rgn_3("selectWorld.tooltip.fromNewerVersion1").class_(rgF_2.RED);
   static final rgP_2 implements_ = new rgn_3("selectWorld.tooltip.fromNewerVersion2").class_(rgF_2.RED);
   static final rgP_2 finally_ = new rgn_3("selectWorld.tooltip.snapshot1").class_(rgF_2.GOLD);
   static final rgP_2 extends_ = new rgn_3("selectWorld.tooltip.snapshot2").class_(rgF_2.GOLD);
   static final rgP_2 return_ = new rgn_3("selectWorld.locked").class_(rgF_2.RED);
   private final Fr_1 public_;
   private List<rrGm_1> goto_;

   public va_3(Fr_1 var1, QY var2, int var3, int var4, int var5, int var6, int var7, Supplier<String> var8, va_3 var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.public_ = var1;
      if (var9 != null) {
         this.goto_ = var9.goto_;
      }

      this.class_(var8, false);
   }

   public void class_(Supplier<String> var1, boolean var2) {
      this.native_();
      rrGd_1 var3 = this.native_.M();
      if (this.goto_ == null || var2) {
         try {
            this.goto_ = var3.class_();
         } catch (QA var7) {
            throws_.error("Couldn't load level list", var7);
            this.native_.break_(new ZC(new rgn_3("selectWorld.unable_to_load"), new rgN_2(var7.getMessage())));
            return;
         }

         Collections.sort(this.goto_);
      }

      if (this.goto_.isEmpty()) {
         this.native_.break_(mo_3.class_((vm_3)null));
      } else {
         String var4 = ((String)var1.get()).toLowerCase(Locale.ROOT);

         for (rrGm_1 var6 : this.goto_) {
            if (var6.break_().toLowerCase(Locale.ROOT).contains(var4) || var6.class_().toLowerCase(Locale.ROOT).contains(var4)) {
               this.break_(new vi_3(this, this, var6));
            }
         }
      }
   }

   public void class_(vi_3 var1) {
      super.class_(var1);
      this.public_.byte_(var1 != null && !var1.protected_.final_());
   }

   @Override
   protected void class_(Lw_1 var1) {
      this.class_(var1, var0 -> !var0.protected_.final_());
   }

   @Override
   protected boolean class_() {
      return this.public_.catch_() == this;
   }

   public Fr_1 implements_() {
      return this.public_;
   }

   @Override
   protected int protected_() {
      return super.protected_() + 20;
   }

   public Optional<vi_3> private_() {
      return Optional.ofNullable(this.finally_());
   }

   @Override
   public int F_() {
      return super.F_() + 50;
   }
}
