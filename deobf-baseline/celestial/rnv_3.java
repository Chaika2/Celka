package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnv_3 extends rnW_2 implements rFR {
   static final Logger id_finally = LogManager.getLogger();
   private static final Pattern id_extends = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final List<rnL_2> id_native = Collections.synchronizedList(Lists.newArrayList());
   private rFo_1 id_volatile;
   private final rFD id_final;
   private rFY id_package;
   private final rnc_3 id_int;
   private rnT_2 id_new;
   private final rgw_3 id_continue;

   @Override
   public boolean id_boolean() {
      return this.id_int.id_class().id_try && super.id_boolean();
   }

   @Override
   public int id_byte() {
      return this.id_short();
   }

   @Override
   public boolean id_int() {
      return this.id_class().id_goto;
   }

   public rnv_3(
      Thread var1,
      rVv_1 var2,
      rrGk_1 var3,
      rAt_1 var4,
      rAh_1 var5,
      rrGP var6,
      rnc_3 var7,
      DataFixer var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      rCB var11,
      roT_2 var12
   ) {
      super(var1, var2, var3, var6, var4, Proxy.NO_PROXY, var8, var5, var9, var10, var11, var12);
      this.id_int = var7;
      this.id_final = new rFD(this);
      this.id_continue = null;
   }

   @Override
   public void id_this() {
      super.id_this();
      rqR_2.id_private();
   }

   @Override
   public boolean s() {
      return this.id_class().id_protected && super.s();
   }

   @Override
   public int n() {
      return this.id_class().id_strictfp;
   }

   @Override
   public boolean d() {
      return true;
   }

   @Override
   public boolean id_interface() {
      return this.id_class().id_while;
   }

   @Override
   public rgV_2 id_class(rhN_2 var1) {
      return this.id_continue != null ? this.id_continue.id_class(var1.sv()) : null;
   }

   public void id_class(String var1, gy_3 var2) {
      this.id_native.add(new rnL_2(var1, var2));
   }

   @Override
   public boolean id_class(rRl_1 var1, boolean var2, int var3) {
      return false;
   }

   @Override
   public boolean id_class(rrEm_1 var1, rfH_2 var2, rhd_3 var3) {
      if (var1.E() != rYB.id_byte) {
         return false;
      } else if (this.rG().id_native().id_byte()) {
         return false;
      } else if (this.rG().id_case(var3.sv())) {
         return false;
      } else if (this.N() <= 0) {
         return false;
      } else {
         rfH_2 var4 = var1.X();
         int var5 = rfU_2.id_class(var2.b_() - var4.b_());
         int var6 = rfU_2.id_class(var2.d_() - var4.d_());
         int var7 = Math.max(var5, var6);
         return var7 <= this.N();
      }
   }

   @Override
   public rnp_3 id_class() {
      return this.id_int.id_class();
   }

   @Override
   public String id_class(String var1) {
      this.id_final.id_class();
      this.id_catch(() -> this.f().id_class(this.id_final.id_byte(), var1));
      return this.id_final.id_break();
   }

   @Override
   public int p() {
      return this.id_class().id_short;
   }

   public void rb() {
      if (this.id_new == null) {
         this.id_new = rnT_2.id_class(this);
      }
   }

   @Override
   public boolean z() {
      return this.id_new != null;
   }

   @Override
   public boolean u() {
      return this.id_class().id_for;
   }

   @Override
   public int r() {
      return this.id_class().id_void;
   }

   @Override
   public int N() {
      return this.id_class().id_char;
   }

   @Override
   public KY id_break(KY var1) {
      var1 = super.id_break(var1);
      var1.id_case().id_class("Is Modded", () -> this.id_static().orElse("Unknown (can't tell)"));
      var1.id_case().id_class("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   @Override
   public void id_break(BooleanSupplier var1) {
      super.id_break(var1);
      this.rE();
   }

   @Override
   public int id_break(int var1) {
      return this.id_class().id_double * var1 / 100;
   }

   @Override
   public String id_break() {
      return this.id_else();
   }

   @Override
   public boolean id_break(GameProfile var1) {
      return false;
   }

   @Override
   public boolean H() {
      return this.id_class().id_const;
   }

   public void id_finally(boolean var1) {
      this.id_int.id_class(var2 -> (rnp_3)var2.P.id_class(this.rS(), var1));
   }

   @Override
   public String id_finally() {
      return "";
   }

   @Override
   public boolean G() {
      return this.id_class().id_throw;
   }

   @Override
   public boolean O() {
      return this.id_class().id_interface;
   }

   @Override
   public boolean id_extends() throws IOException {
      rnF_2 var1 = new rnF_2(this, "Server console handler");
      var1.setDaemon(true);
      var1.setUncaughtExceptionHandler(new rya_3(id_finally));
      var1.start();
      id_finally.info("Starting minecraft server version " + rqu_3.id_class().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         id_finally.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      id_finally.info("Loading properties");
      rnp_3 var2 = this.id_int.id_class();
      if (this.id_const()) {
         this.id_break("127.0.0.1");
      } else {
         this.id_protected(var2.id_class);
         this.id_throws(var2.id_break);
         this.id_break(var2.id_byte);
      }

      this.id_case(var2.id_case);
      this.id_catch(var2.id_catch);
      this.id_class(var2.id_private, this.rs());
      this.id_case(var2.id_implements);
      this.id_private(var2.id_finally);
      super.id_protected((Integer)var2.r.get());
      this.id_implements(var2.id_extends);
      this.id_implements.id_class(var2.id_volatile);
      id_finally.info("Default game type: {}", var2.id_volatile);
      InetAddress var3 = null;
      if (!this.id_else().isEmpty()) {
         var3 = InetAddress.getByName(this.id_else());
      }

      if (this.id_short() < 0) {
         this.id_class(var2.id_package);
      }

      this.id_strictfp();
      id_finally.info("Starting Minecraft server on {}:{}", this.id_else().isEmpty() ? "*" : this.id_else(), this.id_short());

      try {
         this.k().id_class(var3, this.id_short());
      } catch (IOException var10) {
         id_finally.warn("**** FAILED TO BIND TO PORT!");
         id_finally.warn("The exception was: {}", var10.toString());
         id_finally.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.B()) {
         id_finally.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         id_finally.warn("The server will make no attempt to authenticate usernames. Beware.");
         id_finally.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         id_finally.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.rM()) {
         this.F().id_break();
      }

      if (!rCE.id_throws(this)) {
         return false;
      } else {
         this.id_class(new rnZ_2(this, this.id_case, this.id_throws));
         long var4 = rqR_2.id_byte();
         this.id_byte(var2.id_int);
         rys_3.id_class(this.F());
         rys_3.id_class(this.Z());
         rCB.id_class(this.B());
         id_finally.info("Preparing level \"{}\"", this.id_implements());
         this.id_native();
         long var6 = rqR_2.id_byte() - var4;
         String var8 = String.format(Locale.ROOT, "%.3fs", (double)var6 / 1.0E9);
         id_finally.info("Done ({})! For help, type \"help\"", var8);
         if (var2.id_new != null) {
            this.D().id_class(rRu_1.id_return).id_class(var2.id_new, this);
         }

         if (var2.id_continue) {
            id_finally.info("Starting GS4 status listener");
            this.id_volatile = rFo_1.id_class(this);
         }

         if (var2.id_this) {
            id_finally.info("Starting remote control listener");
            this.id_package = rFY.id_class(this);
         }

         if (this.rO() > 0L) {
            Thread var9 = new Thread(new rnC_2(this));
            var9.setUncaughtExceptionHandler(new ryi_3(id_finally));
            var9.setName("Server Watchdog");
            var9.setDaemon(true);
            var9.start();
         }

         rdy_3.id_class.id_class(rdX_2.id_catch, rqs_3.id_class());
         if (var2.id_transient) {
            rnH_2.id_class(this);
         }

         return true;
      }
   }

   @Override
   public int id_continue() {
      return this.id_class().id_long;
   }

   @Override
   public String id_implements() {
      return this.id_protected.id_class();
   }

   @Override
   public int id_new() {
      return this.id_class().id_abstract;
   }

   @Override
   public boolean id_super() {
      return this.id_class().id_default;
   }

   @Override
   public boolean id_switch() {
      return true;
   }

   @Override
   public void id_throw() {
      if (this.id_continue != null) {
         this.id_continue.close();
      }

      if (this.id_new != null) {
         this.id_new.id_break();
      }

      if (this.id_package != null) {
         this.id_package.id_class();
      }

      if (this.id_volatile != null) {
         this.id_volatile.id_class();
      }
   }

   @Override
   public String rs() {
      rnp_3 var1 = this.id_int.id_class();
      String var2;
      if (!var1.id_public.isEmpty()) {
         var2 = var1.id_public;
         if (!Strings.isNullOrEmpty(var1.id_return)) {
            id_finally.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
         }
      } else if (!Strings.isNullOrEmpty(var1.id_return)) {
         id_finally.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
         var2 = var1.id_return;
      } else {
         var2 = "";
      }

      if (!var2.isEmpty() && !id_extends.matcher(var2).matches()) {
         id_finally.warn("Invalid sha1 for ressource-pack-sha1");
      }

      if (!var1.id_private.isEmpty() && var2.isEmpty()) {
         id_finally.warn(
            "You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack."
         );
      }

      return var2;
   }

   @Override
   public Optional<String> id_static() {
      String var1 = this.id_void();
      return !"vanilla".equals(var1) ? Optional.of("Definitely; Server brand changed to '" + var1 + "'") : Optional.empty();
   }

   @Override
   public void id_protected(int var1) {
      super.id_protected(var1);
      this.id_int.id_class(var2 -> (rnp_3)var2.r.id_class(this.rS(), var1));
   }

   @Override
   public String id_protected() {
      return this.h();
   }

   @Override
   public void id_volatile() {
      this.id_class(this.id_class().id_native, true);
   }

   @Override
   public boolean E() {
      return this.id_int.id_class().id_throws && super.E();
   }

   @Override
   public boolean rr() {
      return this.id_int.id_class().id_boolean;
   }

   public long rO() {
      return this.id_class().id_float;
   }

   protected boolean rM() {
      boolean var1 = false;

      for (int var2 = 0; !var1 && var2 <= 2; var2++) {
         if (var2 > 0) {
            id_finally.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.rk();
         }

         var1 = rCE.id_class((rnW_2)this);
      }

      boolean var7 = false;

      for (int var3 = 0; !var7 && var3 <= 2; var3++) {
         if (var3 > 0) {
            id_finally.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.rk();
         }

         var7 = rCE.id_break(this);
      }

      boolean var8 = false;

      for (int var4 = 0; !var8 && var4 <= 2; var4++) {
         if (var4 > 0) {
            id_finally.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.rk();
         }

         var8 = rCE.id_byte(this);
      }

      boolean var9 = false;

      for (int var5 = 0; !var9 && var5 <= 2; var5++) {
         if (var5 > 0) {
            id_finally.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.rk();
         }

         var9 = rCE.id_protected(this);
      }

      boolean var10 = false;

      for (int var6 = 0; !var10 && var6 <= 2; var6++) {
         if (var6 > 0) {
            id_finally.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.rk();
         }

         var10 = rCE.id_class(this);
      }

      return var1 || var7 || var8 || var9 || var10;
   }

   public rnZ_2 rG() {
      return (rnZ_2)super.x();
   }

   private void rk() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public void rE() {
      while (!this.id_native.isEmpty()) {
         rnL_2 var1 = this.id_native.remove(0);
         this.f().id_class(var1.id_break, var1.id_class);
      }
   }
}
