package celestial;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rng_3 extends rnW_2 {
   private static final Logger volatile_ = LogManager.getLogger();
   private final QY final_;
   private boolean package_;
   private int int_ = -1;
   private AJ new_;
   private UUID continue_;
   private long super_ = 0L;
   public rYB finally_ = null;
   public rfH_2 extends_ = null;
   public rRh_1 native_ = null;

   private void byte_(rrEm_1 var1) {
      if (var1.private_(1.0F) > 0.0F || var1.S()) {
         var1.class_(6000, 0, false, false);
      }
   }

   public rng_3(
      Thread var1,
      QY var2,
      rVv_1 var3,
      rrGk_1 var4,
      rAt_1 var5,
      rAh_1 var6,
      rrGP var7,
      MinecraftSessionService var8,
      GameProfileRepository var9,
      rCB var10,
      roT_2 var11
   ) {
      super(var1, var3, var4, var7, var5, var2.W(), var2.protected_(), var6, var8, var9, var10, var11);
      this.throws_(var2.while_().byte_());
      this.byte_(var2.int_());
      this.byte_(256);
      this.class_(new rnV_2(this, this.case_, this.throws_));
      this.final_ = var2;
   }

   @Override
   public void this_() {
      super.this_();
      if (this.new_ != null) {
         this.new_.interrupt();
         this.new_ = null;
      }
   }

   @Override
   public boolean d() {
      return this.int_ > -1;
   }

   @Override
   public boolean class_(rRl_1 var1, boolean var2, int var3) {
      try {
         this.k().class_((InetAddress)null, var3);
         volatile_.info("Started serving on {}", var3);
         this.int_ = var3;
         this.new_ = new AJ(this.h(), var3 + "");
         this.new_.start();
         this.x().class_(var1);
         this.x().break_(var2);
         int var4 = this.class_(((cb_3)this.final_.class_[57]).sv());
         ((cb_3)this.final_.class_[57]).class_(var4);

         for (rhN_2 var6 : this.x().super_()) {
            this.f().class_(var6);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void class_(KY var1) {
      this.final_.break_(var1);
   }

   public void class_(UUID var1) {
      this.continue_ = var1;
   }

   @Override
   public void class_(boolean var1) {
      if (!rrxr_3.Bk.byte_() || this.synchronized_()) {
         this.catch_(() -> {
            for (rhN_2 var2 : Lists.newArrayList(this.x().super_())) {
               if (!var2.ro().equals(this.continue_)) {
                  this.x().byte_(var2);
               }
            }
         });
      }

      super.class_(var1);
      if (this.new_ != null) {
         this.new_.interrupt();
         this.new_ = null;
      }
   }

   @Override
   public void class_(rRl_1 var1) {
      super.class_(var1);
      this.x().class_(var1);
   }

   @Override
   public void class_(BooleanSupplier var1) {
      this.break_();
      boolean var2 = this.package_;
      this.package_ = QY.instanceof_().void_() != null && QY.instanceof_().throw_();
      if (!var2 && this.package_) {
         this.x().implements_();
         this.class_(false, false, false);
      }

      if (!this.package_) {
         super.class_(var1);
         int var3 = Math.max(2, ((Qw_1)this.final_.class_[20]).break_ + -1);
         if (var3 != this.x().new_()) {
            volatile_.info("Changing view distance to {}, from {}", var3, this.x().new_());
            this.x().class_(var3);
         }
      }
   }

   public rRh_1 class_(rYB var1, rfH_2 var2) {
      this.finally_ = var1;
      this.extends_ = var2;
      return this.native_;
   }

   @Override
   public boolean class_(boolean var1, boolean var2, boolean var3) {
      if (var1) {
         int var4 = this.Q();
         int var5 = ((Qw_1)this.final_.class_[20]).rL;
         if ((long)var4 < this.super_ + (long)var5) {
            return false;
         }

         this.super_ = (long)var4;
      }

      return super.class_(var1, var2, var3);
   }

   @Override
   public int short_() {
      return this.int_;
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   public KY break_(KY var1) {
      var1 = super.break_(var1);
      var1.case_().class_("Type", "Integrated Server (map_client.txt)");
      var1.case_().class_("Is Modded", () -> this.static_().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
      return var1;
   }

   @Override
   public boolean break_(GameProfile var1) {
      return var1.getName().equalsIgnoreCase(this.default_());
   }

   @Override
   public int break_(int var1) {
      return (int)(((Qw_1)this.final_.class_[20]).byte_ * (float)var1);
   }

   private void break_() {
      for (rrEm_1 var2 : this.float_()) {
         this.break_(var2);
      }
   }

   private void break_(rrEm_1 var1) {
      if (!rrbb_3.l()) {
         this.protected_(var1);
      }

      if (!rrbb_3.m()) {
         this.byte_(var1);
      }

      if (this.finally_ == var1 && this.extends_ != null) {
         this.native_ = var1.throws_(this.extends_);
         this.finally_ = null;
         this.extends_ = null;
      }
   }

   @Override
   public boolean H() {
      return true;
   }

   @Override
   public boolean G() {
      return false;
   }

   @Override
   public boolean O() {
      return true;
   }

   @Override
   public boolean extends_() {
      volatile_.info("Starting integrated minecraft server version " + rqu_3.class_().getName());
      this.protected_(true);
      this.case_(true);
      this.catch_(true);
      this.strictfp_();
      if (rrxr_3.Sr.byte_() && !rrxr_3.break_(rrxr_3.Sr, this)) {
         return false;
      } else {
         this.native_();
         this.case_(this.default_() + " - " + this.rB().volatile_());
         return rrxr_3.SP.byte_() ? rrxr_3.break_(rrxr_3.SP, this) : true;
      }
   }

   @Override
   public int continue_() {
      return 2;
   }

   @Override
   public File instanceof_() {
      return (File)this.final_.class_[24];
   }

   @Override
   public int new_() {
      return 2;
   }

   @Override
   public boolean super_() {
      return true;
   }

   @Override
   public boolean switch_() {
      return false;
   }

   @Override
   public Optional<String> static_() {
      String var1 = Qn_1.class_();
      if (!var1.equals("vanilla")) {
         return Optional.of("Definitely; Client brand changed to '" + var1 + "'");
      } else {
         var1 = this.void_();
         if (!"vanilla".equals(var1)) {
            return Optional.of("Definitely; Server brand changed to '" + var1 + "'");
         } else {
            return QY.class.getSigners() == null ? Optional.of("Very likely; Jar signature invalidated") : Optional.empty();
         }
      }
   }

   private void protected_(rrEm_1 var1) {
      if (this.package_() == rRl_1.CREATIVE) {
         long var2 = var1.P();
         long var4 = var2 % 24000L;
         if (rrbb_3.C()) {
            if (var4 <= 1000L) {
               var1.class_(var2 - var4 + 1001L);
            }

            if (var4 >= 11000L) {
               var1.class_(var2 - var4 + 24001L);
            }
         }

         if (rrbb_3.H()) {
            if (var4 <= 14000L) {
               var1.class_(var2 - var4 + 14001L);
            }

            if (var4 >= 22000L) {
               var1.class_(var2 - var4 + 24000L + 14001L);
            }
         }
      }
   }

   @Override
   public boolean rr() {
      return ((Qw_1)this.final_.class_[20]).rb;
   }
}
