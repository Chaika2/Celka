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
   private static final Logger id_volatile = LogManager.getLogger();
   private final QY id_final;
   private boolean id_package;
   private int id_int = -1;
   private AJ id_new;
   private UUID id_continue;
   private long id_super = 0L;
   public rYB id_finally = null;
   public rfH_2 id_extends = null;
   public rRh_1 id_native = null;

   private void id_byte(rrEm_1 var1) {
      if (var1.id_private(1.0F) > 0.0F || var1.S()) {
         var1.id_class(6000, 0, false, false);
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
      super(var1, var3, var4, var7, var5, var2.W(), var2.id_protected(), var6, var8, var9, var10, var11);
      this.id_throws(var2.id_while().id_byte());
      this.id_byte(var2.id_int());
      this.id_byte(256);
      this.id_class(new rnV_2(this, this.id_case, this.id_throws));
      this.id_final = var2;
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_new != null) {
         this.id_new.interrupt();
         this.id_new = null;
      }
   }

   @Override
   public boolean d() {
      return this.id_int > -1;
   }

   @Override
   public boolean id_class(rRl_1 var1, boolean var2, int var3) {
      try {
         this.k().id_class((InetAddress)null, var3);
         id_volatile.info("Started serving on {}", var3);
         this.id_int = var3;
         this.id_new = new AJ(this.h(), var3 + "");
         this.id_new.start();
         this.x().id_class(var1);
         this.x().id_break(var2);
         int var4 = this.id_class(((cb_3)this.id_final.id_class[57]).sv());
         ((cb_3)this.id_final.id_class[57]).id_class(var4);

         for (rhN_2 var6 : this.x().id_super()) {
            this.f().id_class(var6);
         }

         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   @Override
   public void id_class(KY var1) {
      this.id_final.id_break(var1);
   }

   public void id_class(UUID var1) {
      this.id_continue = var1;
   }

   @Override
   public void id_class(boolean var1) {
      if (!rrxr_3.Bk.id_byte() || this.id_synchronized()) {
         this.id_catch(() -> {
            for (rhN_2 var2 : Lists.newArrayList(this.x().id_super())) {
               if (!var2.ro().equals(this.id_continue)) {
                  this.x().id_byte(var2);
               }
            }
         });
      }

      super.id_class(var1);
      if (this.id_new != null) {
         this.id_new.interrupt();
         this.id_new = null;
      }
   }

   @Override
   public void id_class(rRl_1 var1) {
      super.id_class(var1);
      this.x().id_class(var1);
   }

   @Override
   public void id_class(BooleanSupplier var1) {
      this.id_break();
      boolean var2 = this.id_package;
      this.id_package = QY.id_instanceof().id_void() != null && QY.id_instanceof().id_throw();
      if (!var2 && this.id_package) {
         this.x().id_implements();
         this.id_class(false, false, false);
      }

      if (!this.id_package) {
         super.id_class(var1);
         int var3 = Math.max(2, ((Qw_1)this.id_final.id_class[20]).id_break + -1);
         if (var3 != this.x().id_new()) {
            id_volatile.info("Changing view distance to {}, from {}", var3, this.x().id_new());
            this.x().id_class(var3);
         }
      }
   }

   public rRh_1 id_class(rYB var1, rfH_2 var2) {
      this.id_finally = var1;
      this.id_extends = var2;
      return this.id_native;
   }

   @Override
   public boolean id_class(boolean var1, boolean var2, boolean var3) {
      if (var1) {
         int var4 = this.Q();
         int var5 = ((Qw_1)this.id_final.id_class[20]).rL;
         if ((long)var4 < this.id_super + (long)var5) {
            return false;
         }

         this.id_super = (long)var4;
      }

      return super.id_class(var1, var2, var3);
   }

   @Override
   public int id_short() {
      return this.id_int;
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   public KY id_break(KY var1) {
      var1 = super.id_break(var1);
      var1.id_case().id_class("Type", "Integrated Server (map_client.txt)");
      var1.id_case().id_class("Is Modded", () -> this.id_static().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
      return var1;
   }

   @Override
   public boolean id_break(GameProfile var1) {
      return var1.getName().equalsIgnoreCase(this.id_default());
   }

   @Override
   public int id_break(int var1) {
      return (int)(((Qw_1)this.id_final.id_class[20]).id_byte * (float)var1);
   }

   private void id_break() {
      for (rrEm_1 var2 : this.id_float()) {
         this.id_break(var2);
      }
   }

   private void id_break(rrEm_1 var1) {
      if (!rrbb_3.l()) {
         this.id_protected(var1);
      }

      if (!rrbb_3.m()) {
         this.id_byte(var1);
      }

      if (this.id_finally == var1 && this.id_extends != null) {
         this.id_native = var1.id_throws(this.id_extends);
         this.id_finally = null;
         this.id_extends = null;
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
   public boolean id_extends() {
      id_volatile.info("Starting integrated minecraft server version " + rqu_3.id_class().getName());
      this.id_protected(true);
      this.id_case(true);
      this.id_catch(true);
      this.id_strictfp();
      if (rrxr_3.Sr.id_byte() && !rrxr_3.id_break(rrxr_3.Sr, this)) {
         return false;
      } else {
         this.id_native();
         this.id_case(this.id_default() + " - " + this.rB().id_volatile());
         return rrxr_3.SP.id_byte() ? rrxr_3.id_break(rrxr_3.SP, this) : true;
      }
   }

   @Override
   public int id_continue() {
      return 2;
   }

   @Override
   public File id_instanceof() {
      return (File)this.id_final.id_class[24];
   }

   @Override
   public int id_new() {
      return 2;
   }

   @Override
   public boolean id_super() {
      return true;
   }

   @Override
   public boolean id_switch() {
      return false;
   }

   @Override
   public Optional<String> id_static() {
      String var1 = Qn_1.id_class();
      if (!var1.equals("vanilla")) {
         return Optional.of("Definitely; Client brand changed to '" + var1 + "'");
      } else {
         var1 = this.id_void();
         if (!"vanilla".equals(var1)) {
            return Optional.of("Definitely; Server brand changed to '" + var1 + "'");
         } else {
            return QY.class.getSigners() == null ? Optional.of("Very likely; Jar signature invalidated") : Optional.empty();
         }
      }
   }

   private void id_protected(rrEm_1 var1) {
      if (this.id_package() == rRl_1.CREATIVE) {
         long var2 = var1.P();
         long var4 = var2 % 24000L;
         if (rrbb_3.C()) {
            if (var4 <= 1000L) {
               var1.id_class(var2 - var4 + 1001L);
            }

            if (var4 >= 11000L) {
               var1.id_class(var2 - var4 + 24001L);
            }
         }

         if (rrbb_3.H()) {
            if (var4 <= 14000L) {
               var1.id_class(var2 - var4 + 14001L);
            }

            if (var4 >= 22000L) {
               var1.id_class(var2 - var4 + 24000L + 14001L);
            }
         }
      }
   }

   @Override
   public boolean rr() {
      return ((Qw_1)this.id_final.id_class[20]).rb;
   }
}
