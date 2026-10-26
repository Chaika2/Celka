package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public class Fe_1 extends vm_3 {
   protected static final rqO_2 class_ = new rqO_2("textures/gui/social_interactions.png");
   private static final rgP_2 throws_ = new rgn_3("gui.socialInteractions.tab_all");
   private static final rgP_2 case_ = new rgn_3("gui.socialInteractions.tab_hidden");
   private static final rgP_2 catch_ = new rgn_3("gui.socialInteractions.tab_blocked");
   private static final rgP_2 private_ = throws_.throws_().class_(rgF_2.UNDERLINE);
   private static final rgP_2 implements_ = case_.throws_().class_(rgF_2.UNDERLINE);
   private static final rgP_2 finally_ = catch_.throws_().class_(rgF_2.UNDERLINE);
   private static final rgP_2 else_ = new rgn_3("gui.socialInteractions.search_hint").class_(rgF_2.ITALIC).class_(rgF_2.GRAY);
   static final rgP_2 synchronized_ = new rgn_3("gui.socialInteractions.search_empty").class_(rgF_2.GRAY);
   private static final rgP_2 return_ = new rgn_3("gui.socialInteractions.empty_hidden").class_(rgF_2.GRAY);
   private static final rgP_2 public_ = new rgn_3("gui.socialInteractions.empty_blocked").class_(rgF_2.GRAY);
   private static final rgP_2 goto_ = new rgn_3("gui.socialInteractions.blocking_hint");
   FY while_;
   Lu_1 try_;
   private String instanceof_ = "";
   private Lr_1 throw_ = Lr_1.ALL;
   private LF interface_;
   private LF char_;
   private LF abstract_;
   private LF long_;
   private rgP_2 float_;
   private int boolean_;
   private boolean transient_;
   private Runnable for_;

   public Fe_1() {
      super(new rgn_3("gui.socialInteractions.title"));
      this.class_(QY.instanceof_());
   }

   public void class_(Aw_1 var1) {
      this.while_.class_(var1, this.throw_);
   }

   private void class_(QY var1) {
      int var2 = var1.void_().throws_().size();
      if (this.boolean_ != var2) {
         String var3 = "";
         Ak_1 var4 = var1.S();
         if (var1.switch_()) {
            var3 = var1.this_().h();
         } else if (var4 != null) {
            var3 = var4.class_;
         }

         if (var2 > 1) {
            this.float_ = new rgn_3("gui.socialInteractions.server_label.multiple", var3, var2);
         } else {
            this.float_ = new rgn_3("gui.socialInteractions.server_label.single", var3, var2);
         }

         this.boolean_ = var2;
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (!this.try_.aO_() && ((Qw_1)this.volatile_.class_[20]).A.class_(var1, var2)) {
         this.volatile_.break_((vm_3)null);
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(this.volatile_);
      this.class_(var1);
      if (this.float_ != null) {
         break_(var1, (cm_3)this.volatile_.class_[15], this.float_, this.package_() + 8, 35, -1);
      }

      if (!this.while_.private_()) {
         this.while_.class_(var1, var2, var3, var4);
      } else if (!this.try_.private_().isEmpty()) {
         class_(var1, (cm_3)this.volatile_.class_[15], synchronized_, this.package_ / 2, (78 + this.final_()) / 2, -1);
      } else {
         switch (this.throw_) {
            case HIDDEN:
               class_(var1, (cm_3)this.volatile_.class_[15], return_, this.package_ / 2, (78 + this.final_()) / 2, -1);
               break;
            case BLOCKED:
               class_(var1, (cm_3)this.volatile_.class_[15], public_, this.package_ / 2, (78 + this.final_()) / 2, -1);
         }
      }

      if (!this.try_.aO_() && this.try_.private_().isEmpty()) {
         break_(var1, (cm_3)this.volatile_.class_[15], else_, this.try_.volatile_, this.try_.final_, -1);
      } else {
         this.try_.class_(var1, var2, var3, var4);
      }

      this.long_.new_ = this.throw_ == Lr_1.BLOCKED;
      super.class_(var1, var2, var3, var4);
      if (this.for_ != null) {
         this.for_.run();
      }
   }

   public void class_(UUID var1) {
      this.while_.class_(var1);
   }

   public void class_(Runnable var1) {
      this.for_ = var1;
   }

   private void class_(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.instanceof_)) {
         this.while_.class_(var1);
         this.instanceof_ = var1;
         this.class_(this.throw_);
      }
   }

   private void class_(Lr_1 var1) {
      this.throw_ = var1;
      this.interface_.break_(throws_);
      this.char_.break_(case_);
      this.abstract_.break_(catch_);

      Object var2 = switch (var1) {
         case ALL -> {
            this.interface_.break_(private_);
            yield ((Aq_1)((cb_3)this.volatile_.class_[57]).break_[0]).case_();
         }
         case HIDDEN -> {
            this.char_.break_(implements_);
            yield this.volatile_.volatile_().class_();
         }
         case BLOCKED -> {
            this.abstract_.break_(finally_);
            FU var3 = this.volatile_.volatile_();
            yield ((Aq_1)((cb_3)this.volatile_.class_[57]).break_[0]).case_().stream().filter(var3::throws_).collect(Collectors.toSet());
         }
         default -> ImmutableList.of();
      };
      this.throw_ = var1;
      this.while_.class_((Collection<UUID>)var2, this.while_.package_());
   }

   @Override
   public void class_(Ml_1 var1) {
      int var2 = this.package_() + 3;
      super.class_(var1);
      this.volatile_.A().class_(class_);
      this.break_(var1, var2, 64, 1, 1, 236, 8);
      int var3 = this.native_();

      for (int var4 = 0; var4 < var3; var4++) {
         this.break_(var1, var2, 72 + 16 * var4, 1, 10, 236, 16);
      }

      this.break_(var1, var2, 72 + 16 * var3, 1, 27, 236, 8);
      this.break_(var1, var2 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.try_.aO_()) {
         this.try_.break_(var1, var3, var5);
      }

      return super.break_(var1, var3, var5) || this.while_.break_(var1, var3, var5);
   }

   private int finally_() {
      return Math.max(52, this.int_ - 128 - 16);
   }

   private int package_() {
      return (this.package_ - 238) / 2;
   }

   @Override
   public void private_() {
      super.private_();
      this.try_.catch_();
   }

   private int final_() {
      return 80 + this.native_() * 16 - 8;
   }

   private int native_() {
      return this.finally_() / 16;
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.float_.getString();
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      if (this.transient_) {
         this.while_.break_(this.package_, this.int_, 88, this.final_());
      } else {
         this.while_ = new FY(this, this.volatile_, this.package_, this.int_, 88, this.final_(), 36);
      }

      int var1 = this.while_.F_() / 3;
      int var2 = this.while_.continue_();
      int var3 = this.while_.super_();
      int var4 = this.super_.class_(goto_) + 40;
      int var5 = 64 + 16 * this.native_();
      int var6 = (this.package_ - var4) / 2;
      this.interface_ = this.class_((LF)(new LF(var2, 45, var1, 20, throws_, var1x -> this.class_(Lr_1.ALL))));
      this.char_ = this.class_((LF)(new LF((var2 + var3 - var1) / 2 + 1, 45, var1, 20, case_, var1x -> this.class_(Lr_1.HIDDEN))));
      this.abstract_ = this.class_((LF)(new LF(var3 - var1 + 1, 45, var1, 20, catch_, var1x -> this.class_(Lr_1.BLOCKED))));
      this.long_ = this.class_((LF)(new LF(var6, var5, var4, 20, goto_, var1x -> this.volatile_.break_(new mq_3(var1xx -> {
            if (var1xx) {
               rqR_2.implements_().class_("https://aka.ms/javablocking");
            }

            this.volatile_.break_(this);
         }, "https://aka.ms/javablocking", true)))));
      String var7 = this.try_ != null ? this.try_.private_() : "";
      this.try_ = new Fa_1(this, this.super_, this.package_() + 28, 78, 196, 16, else_);
      this.try_.implements_(16);
      this.try_.protected_(false);
      this.try_.private_(true);
      this.try_.finally_(16777215);
      this.try_.class_(var7);
      this.try_.class_(this::class_);
      this.native_.add(this.try_);
      this.native_.add(this.while_);
      this.transient_ = true;
      this.class_(this.throw_);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
