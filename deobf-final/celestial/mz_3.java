package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.IDN;
import java.util.function.Predicate;

public class mz_3 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("addServer.enterName");
   private static final rgP_2 throws_ = new rgn_3("addServer.enterIp");
   private LF case_;
   private final BooleanConsumer catch_;
   private final Ak_1 private_;
   private Lu_1 implements_;
   private Lu_1 finally_;
   private LF else_;
   private final vm_3 synchronized_;
   private final Predicate<String> return_ = var0 -> {
      if (rql_3.break_(var0)) {
         return true;
      } else {
         String[] var1x = var0.split(":");
         if (var1x.length == 0) {
            return true;
         } else {
            try {
               String var2x = IDN.toASCII(var1x[0]);
               return true;
            } catch (IllegalArgumentException var3x) {
               return false;
            }
         }
      }
   };

   public mz_3(vm_3 var1, BooleanConsumer var2, Ak_1 var3) {
      super(new rgn_3("addServer.title"));
      this.synchronized_ = var1;
      this.catch_ = var2;
      this.private_ = var3;
   }

   private static rgP_2 class_(Az_1 var0) {
      return new rgn_3("addServer.resourcePack").break_(": ").class_(var0.class_());
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if ((var1 == 257 || var1 == 335) && this.case_.int_) {
         this.finally_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 17, 16777215);
      break_(var1, this.super_, class_, this.package_ / 2 - 100, 53, 10526880);
      break_(var1, this.super_, throws_, this.package_ / 2 - 100, 94, 10526880);
      this.finally_.class_(var1, var2, var3, var4);
      this.implements_.class_(var1, var2, var3, var4);
      super.class_(var1, var2, var3, var4);
   }

   private void class_(String var1) {
      this.native_();
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.implements_.private_();
      String var5 = this.finally_.private_();
      this.break_(var1, var2, var3);
      this.implements_.class_(var4);
      this.finally_.class_(var5);
   }

   private void finally_() {
      this.private_.class_ = this.finally_.private_();
      this.private_.break_ = this.implements_.private_();
      this.catch_.accept(true);
   }

   @Override
   public void private_() {
      this.finally_.catch_();
      this.implements_.catch_();
   }

   @Override
   public void volatile_() {
      this.native_();
      this.volatile_.break_(this.synchronized_);
   }

   private void native_() {
      String var1 = this.implements_.private_();
      boolean var2 = !var1.isEmpty() && var1.split(":").length > 0 && var1.indexOf(32) == -1;
      this.case_.int_ = var2 && !this.finally_.private_().isEmpty();
      if (this.private_ instanceof rrwp_3) {
         this.implements_.case_(false);
         this.implements_.byte_(false);
         this.finally_.case_(false);
         this.finally_.byte_(false);
      }
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.finally_ = new Lu_1(this.super_, this.package_ / 2 - 100, 66, 200, 20, new rgn_3("addServer.enterName"));
      this.finally_.byte_(true);
      this.finally_.class_(this.private_.class_);
      this.finally_.class_(this::class_);
      this.native_.add(this.finally_);
      this.implements_ = new Lu_1(this.super_, this.package_ / 2 - 100, 106, 200, 20, new rgn_3("addServer.enterIp"));
      this.implements_.implements_(128);
      this.implements_.class_(this.private_.break_);
      this.implements_.class_(this.return_);
      this.implements_.class_(this::class_);
      this.native_.add(this.implements_);
      this.else_ = this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 72, 200, 20, class_(this.private_.break_()), var1 -> {
         this.private_.class_(Az_1.values()[(this.private_.break_().ordinal() + 1) % Az_1.values().length]);
         this.else_.break_(class_(this.private_.break_()));
      })));
      this.case_ = this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 96 + 18, 200, 20, new rgn_3("addServer.add"), var1 -> this.finally_())));
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 120 + 18, 200, 20, cN_2.protected_, var1 -> this.catch_.accept(false))));
      this.native_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
