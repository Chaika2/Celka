package celestial;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vG_2 extends vm_3 {
   private static final Logger throws_ = LogManager.getLogger();
   private final Av_1 case_ = new Av_1();
   private final vm_3 catch_;
   protected vF_2 class_;
   private AQ private_;
   private LF implements_;
   private LF finally_;
   private LF else_;
   private List<rgP_2> synchronized_;
   private Ak_1 return_;
   private Am_1 public_;
   private Au_1 goto_;
   private boolean while_;

   private void byte_(boolean var1) {
      vL_2 var2 = this.class_.finally_();
      if (var1 && var2 instanceof vC_2 var3) {
         this.private_.class_(var3.break_());
         this.private_.break_();
         this.class_.class_(null);
         this.class_.class_(this.private_);
      }

      this.volatile_.break_(this);
   }

   private void int_() {
      this.volatile_.break_(new vG_2(this.catch_));
   }

   public vG_2(vm_3 var1) {
      super(new rgn_3("multiplayer.title"));
      this.catch_ = var1;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 == 294) {
         this.int_();
         return true;
      } else if (this.class_.finally_() != null) {
         if (var1 != 257 && var1 != 335) {
            return this.class_.class_(var1, var2, var3);
         } else {
            this.finally_();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.synchronized_ = null;
      this.class_(var1);
      this.class_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, 16777215);
      super.class_(var1, var2, var3, var4);
      if (this.synchronized_ != null) {
         this.class_(var1, this.synchronized_, var2, var3);
      }
   }

   private void class_(Ak_1 var1) {
      this.volatile_.break_(new mt_3(this, this.volatile_, var1));
   }

   public void class_(List<rgP_2> var1) {
      this.synchronized_ = var1;
   }

   public void class_(vL_2 var1) {
      this.class_.class_(var1);
      this.native_();
   }

   private void throws_(boolean var1) {
      if (var1) {
         this.private_.break_(this.return_);
         this.private_.break_();
         this.class_.class_(null);
         this.class_.class_(this.private_);
      }

      this.volatile_.break_(this);
   }

   public void finally_() {
      vL_2 var1 = this.class_.finally_();
      if (var1 instanceof vC_2) {
         this.class_(((vC_2)var1).break_());
      } else if (var1 instanceof vA_2) {
         AZ var2 = ((vA_2)var1).class_();
         this.class_(new Ak_1(var2.class_(), var2.break_(), true));
      }
   }

   private void case_(boolean var1) {
      if (var1) {
         this.class_(this.return_);
      } else {
         this.volatile_.break_(this);
      }
   }

   public AQ package_() {
      return this.private_;
   }

   private void protected_(boolean var1) {
      vL_2 var2 = this.class_.finally_();
      if (var1 && var2 instanceof vC_2) {
         Ak_1 var3 = ((vC_2)var2).break_();
         var3.class_ = this.return_.class_;
         var3.break_ = this.return_.break_;
         var3.class_(this.return_);
         this.private_.break_();
         this.class_.class_(this.private_);
      }

      this.volatile_.break_(this);
   }

   @Override
   public void private_() {
      super.private_();
      if (this.public_.class_()) {
         List var1 = this.public_.byte_();
         this.public_.break_();
         this.class_.class_(var1);
      }

      this.case_.class_();
   }

   public Av_1 final_() {
      return this.case_;
   }

   protected void native_() {
      this.finally_.int_ = false;
      this.implements_.int_ = false;
      this.else_.int_ = false;
      vL_2 var1 = this.class_.finally_();
      if (var1 != null && !(var1 instanceof vn_3)) {
         this.finally_.int_ = true;
         if (var1 instanceof vC_2 var2) {
            this.implements_.int_ = true;
            if (var2.break_() instanceof rrwp_3) {
               this.else_.int_ = false;
            } else {
               this.else_.int_ = true;
            }
         }
      }
   }

   @Override
   protected void v_() {
      super.v_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      if (this.while_) {
         this.class_.break_(this.package_, this.int_, 32, this.int_ - 64);
      } else {
         this.while_ = true;
         this.private_ = new AQ(this.volatile_);
         this.private_.class_();
         this.public_ = new Am_1();

         try {
            this.goto_ = new Au_1(this.public_);
            this.goto_.start();
         } catch (Exception var2) {
            throws_.warn("Unable to start LAN server detection: {}", var2.getMessage());
         }

         this.class_ = new vF_2(this, this.volatile_, this.package_, this.int_, 32, this.int_ - 64, 36);
         this.class_.class_(this.private_);
      }

      rrwm_3.class_(this);
      this.native_.add(this.class_);
      this.finally_ = this.class_((LF)(new LF(this.package_ / 2 - 154, this.int_ - 52, 100, 20, new rgn_3("selectServer.select"), var1 -> this.finally_())));
      this.class_((LF)(new LF(this.package_ / 2 - 50, this.int_ - 52, 100, 20, new rgn_3("selectServer.direct"), var1 -> {
         this.return_ = new Ak_1(jI_2.class_("selectServer.defaultName"), "", false);
         this.volatile_.break_(new vv_3(this, this::case_, this.return_));
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 4 + 50, this.int_ - 52, 100, 20, new rgn_3("selectServer.add"), var1 -> {
         this.return_ = new Ak_1(jI_2.class_("selectServer.defaultName"), "", false);
         this.volatile_.break_(new mz_3(this, this::throws_, this.return_));
      })));
      this.implements_ = this.class_((LF)(new LF(this.package_ / 2 - 154, this.int_ - 28, 70, 20, new rgn_3("selectServer.edit"), var1 -> {
         vL_2 var2x = this.class_.finally_();
         if (var2x instanceof vC_2) {
            Ak_1 var3 = ((vC_2)var2x).break_();
            if (var3 instanceof rrwp_3 var4) {
               this.return_ = var4.catch_();
               this.return_.class_(var4);
            } else {
               this.return_ = new Ak_1(var3.class_, var3.break_, false);
               this.return_.class_(var3);
            }

            this.volatile_.break_(new mz_3(this, this::protected_, this.return_));
         }
      })));
      this.else_ = this.class_((LF)(new LF(this.package_ / 2 - 74, this.int_ - 28, 70, 20, new rgn_3("selectServer.delete"), var1 -> {
         vL_2 var2x = this.class_.finally_();
         if (var2x instanceof vC_2) {
            String var3 = ((vC_2)var2x).break_().class_;
            if (var3 != null) {
               rgn_3 var4 = new rgn_3("selectServer.deleteQuestion");
               rgn_3 var5 = new rgn_3("selectServer.deleteWarning", var3);
               rgn_3 var6 = new rgn_3("selectServer.deleteButton");
               rgP_2 var7 = cN_2.protected_;
               this.volatile_.break_(new mT_2(this::byte_, var4, var5, var6, var7));
            }
         }
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 4, this.int_ - 28, 70, 20, new rgn_3("selectServer.refresh"), var1 -> this.int_())));
      this.class_((LF)(new LF(this.package_ / 2 + 4 + 76, this.int_ - 28, 75, 20, cN_2.protected_, var1 -> this.volatile_.break_(this.catch_))));
      this.class_(rrjC_2.protected_().byte_());
      this.native_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
      if (this.goto_ != null) {
         this.goto_.interrupt();
         this.goto_ = null;
      }

      this.case_.break_();
   }
}
