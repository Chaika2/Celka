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
   static final Logger finally_ = LogManager.getLogger();
   private static final Pattern extends_ = Pattern.compile("^[a-fA-F0-9]{40}$");
   private final List<rnL_2> native_ = Collections.synchronizedList(Lists.newArrayList());
   private rFo_1 volatile_;
   private final rFD final_;
   private rFY package_;
   private final rnc_3 int_;
   private rnT_2 new_;
   private final rgw_3 continue_;

   @Override
   public boolean boolean_() {
      return this.int_.class_().try_ && super.boolean_();
   }

   @Override
   public int byte_() {
      return this.short_();
   }

   @Override
   public boolean int_() {
      return this.class_().goto_;
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
      this.int_ = var7;
      this.final_ = new rFD(this);
      this.continue_ = null;
   }

   @Override
   public void this_() {
      super.this_();
      rqR_2.private_();
   }

   @Override
   public boolean s() {
      return this.class_().protected_ && super.s();
   }

   @Override
   public int n() {
      return this.class_().strictfp_;
   }

   @Override
   public boolean d() {
      return true;
   }

   @Override
   public boolean interface_() {
      return this.class_().while_;
   }

   @Override
   public rgV_2 class_(rhN_2 var1) {
      return this.continue_ != null ? this.continue_.class_(var1.sv()) : null;
   }

   public void class_(String var1, gy_3 var2) {
      this.native_.add(new rnL_2(var1, var2));
   }

   @Override
   public boolean class_(rRl_1 var1, boolean var2, int var3) {
      return false;
   }

   @Override
   public boolean class_(rrEm_1 var1, rfH_2 var2, rhd_3 var3) {
      if (var1.E() != rYB.byte_) {
         return false;
      } else if (this.rG().native_().byte_()) {
         return false;
      } else if (this.rG().case_(var3.sv())) {
         return false;
      } else if (this.N() <= 0) {
         return false;
      } else {
         rfH_2 var4 = var1.X();
         int var5 = rfU_2.class_(var2.b_() - var4.b_());
         int var6 = rfU_2.class_(var2.d_() - var4.d_());
         int var7 = Math.max(var5, var6);
         return var7 <= this.N();
      }
   }

   @Override
   public rnp_3 class_() {
      return this.int_.class_();
   }

   @Override
   public String class_(String var1) {
      this.final_.class_();
      this.catch_(() -> this.f().class_(this.final_.byte_(), var1));
      return this.final_.break_();
   }

   @Override
   public int p() {
      return this.class_().short_;
   }

   public void rb() {
      if (this.new_ == null) {
         this.new_ = rnT_2.class_(this);
      }
   }

   @Override
   public boolean z() {
      return this.new_ != null;
   }

   @Override
   public boolean u() {
      return this.class_().for_;
   }

   @Override
   public int r() {
      return this.class_().void_;
   }

   @Override
   public int N() {
      return this.class_().char_;
   }

   @Override
   public KY break_(KY var1) {
      var1 = super.break_(var1);
      var1.case_().class_("Is Modded", () -> this.static_().orElse("Unknown (can't tell)"));
      var1.case_().class_("Type", () -> "Dedicated Server (map_server.txt)");
      return var1;
   }

   @Override
   public void break_(BooleanSupplier var1) {
      super.break_(var1);
      this.rE();
   }

   @Override
   public int break_(int var1) {
      return this.class_().double_ * var1 / 100;
   }

   @Override
   public String break_() {
      return this.else_();
   }

   @Override
   public boolean break_(GameProfile var1) {
      return false;
   }

   @Override
   public boolean H() {
      return this.class_().const_;
   }

   public void finally_(boolean var1) {
      this.int_.class_(var2 -> (rnp_3)var2.P.class_(this.rS(), var1));
   }

   @Override
   public String finally_() {
      return "";
   }

   @Override
   public boolean G() {
      return this.class_().throw_;
   }

   @Override
   public boolean O() {
      return this.class_().interface_;
   }

   @Override
   public boolean extends_() throws IOException {
      rnF_2 var1 = new rnF_2(this, "Server console handler");
      var1.setDaemon(true);
      var1.setUncaughtExceptionHandler(new rya_3(finally_));
      var1.start();
      finally_.info("Starting minecraft server version " + rqu_3.class_().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         finally_.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      finally_.info("Loading properties");
      rnp_3 var2 = this.int_.class_();
      if (this.const_()) {
         this.break_("127.0.0.1");
      } else {
         this.protected_(var2.class_);
         this.throws_(var2.break_);
         this.break_(var2.byte_);
      }

      this.case_(var2.case_);
      this.catch_(var2.catch_);
      this.class_(var2.private_, this.rs());
      this.case_(var2.implements_);
      this.private_(var2.finally_);
      super.protected_((Integer)var2.r.get());
      this.implements_(var2.extends_);
      this.implements_.class_(var2.volatile_);
      finally_.info("Default game type: {}", var2.volatile_);
      InetAddress var3 = null;
      if (!this.else_().isEmpty()) {
         var3 = InetAddress.getByName(this.else_());
      }

      if (this.short_() < 0) {
         this.class_(var2.package_);
      }

      this.strictfp_();
      finally_.info("Starting Minecraft server on {}:{}", this.else_().isEmpty() ? "*" : this.else_(), this.short_());

      try {
         this.k().class_(var3, this.short_());
      } catch (IOException var10) {
         finally_.warn("**** FAILED TO BIND TO PORT!");
         finally_.warn("The exception was: {}", var10.toString());
         finally_.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.B()) {
         finally_.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         finally_.warn("The server will make no attempt to authenticate usernames. Beware.");
         finally_.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         finally_.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.rM()) {
         this.F().break_();
      }

      if (!rCE.throws_(this)) {
         return false;
      } else {
         this.class_(new rnZ_2(this, this.case_, this.throws_));
         long var4 = rqR_2.byte_();
         this.byte_(var2.int_);
         rys_3.class_(this.F());
         rys_3.class_(this.Z());
         rCB.class_(this.B());
         finally_.info("Preparing level \"{}\"", this.implements_());
         this.native_();
         long var6 = rqR_2.byte_() - var4;
         String var8 = String.format(Locale.ROOT, "%.3fs", (double)var6 / 1.0E9);
         finally_.info("Done ({})! For help, type \"help\"", var8);
         if (var2.new_ != null) {
            this.D().class_(rRu_1.return_).class_(var2.new_, this);
         }

         if (var2.continue_) {
            finally_.info("Starting GS4 status listener");
            this.volatile_ = rFo_1.class_(this);
         }

         if (var2.this_) {
            finally_.info("Starting remote control listener");
            this.package_ = rFY.class_(this);
         }

         if (this.rO() > 0L) {
            Thread var9 = new Thread(new rnC_2(this));
            var9.setUncaughtExceptionHandler(new ryi_3(finally_));
            var9.setName("Server Watchdog");
            var9.setDaemon(true);
            var9.start();
         }

         rdy_3.class_.class_(rdX_2.catch_, rqs_3.class_());
         if (var2.transient_) {
            rnH_2.class_(this);
         }

         return true;
      }
   }

   @Override
   public int continue_() {
      return this.class_().long_;
   }

   @Override
   public String implements_() {
      return this.protected_.class_();
   }

   @Override
   public int new_() {
      return this.class_().abstract_;
   }

   @Override
   public boolean super_() {
      return this.class_().default_;
   }

   @Override
   public boolean switch_() {
      return true;
   }

   @Override
   public void throw_() {
      if (this.continue_ != null) {
         this.continue_.close();
      }

      if (this.new_ != null) {
         this.new_.break_();
      }

      if (this.package_ != null) {
         this.package_.class_();
      }

      if (this.volatile_ != null) {
         this.volatile_.class_();
      }
   }

   @Override
   public String rs() {
      rnp_3 var1 = this.int_.class_();
      String var2;
      if (!var1.public_.isEmpty()) {
         var2 = var1.public_;
         if (!Strings.isNullOrEmpty(var1.return_)) {
            finally_.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
         }
      } else if (!Strings.isNullOrEmpty(var1.return_)) {
         finally_.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
         var2 = var1.return_;
      } else {
         var2 = "";
      }

      if (!var2.isEmpty() && !extends_.matcher(var2).matches()) {
         finally_.warn("Invalid sha1 for ressource-pack-sha1");
      }

      if (!var1.private_.isEmpty() && var2.isEmpty()) {
         finally_.warn(
            "You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack."
         );
      }

      return var2;
   }

   @Override
   public Optional<String> static_() {
      String var1 = this.void_();
      return !"vanilla".equals(var1) ? Optional.of("Definitely; Server brand changed to '" + var1 + "'") : Optional.empty();
   }

   @Override
   public void protected_(int var1) {
      super.protected_(var1);
      this.int_.class_(var2 -> (rnp_3)var2.r.class_(this.rS(), var1));
   }

   @Override
   public String protected_() {
      return this.h();
   }

   @Override
   public void volatile_() {
      this.class_(this.class_().native_, true);
   }

   @Override
   public boolean E() {
      return this.int_.class_().throws_ && super.E();
   }

   @Override
   public boolean rr() {
      return this.int_.class_().boolean_;
   }

   public long rO() {
      return this.class_().float_;
   }

   protected boolean rM() {
      boolean var1 = false;

      for (int var2 = 0; !var1 && var2 <= 2; var2++) {
         if (var2 > 0) {
            finally_.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.rk();
         }

         var1 = rCE.class_((rnW_2)this);
      }

      boolean var7 = false;

      for (int var3 = 0; !var7 && var3 <= 2; var3++) {
         if (var3 > 0) {
            finally_.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.rk();
         }

         var7 = rCE.break_(this);
      }

      boolean var8 = false;

      for (int var4 = 0; !var8 && var4 <= 2; var4++) {
         if (var4 > 0) {
            finally_.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.rk();
         }

         var8 = rCE.byte_(this);
      }

      boolean var9 = false;

      for (int var5 = 0; !var9 && var5 <= 2; var5++) {
         if (var5 > 0) {
            finally_.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.rk();
         }

         var9 = rCE.protected_(this);
      }

      boolean var10 = false;

      for (int var6 = 0; !var10 && var6 <= 2; var6++) {
         if (var6 > 0) {
            finally_.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.rk();
         }

         var10 = rCE.class_(this);
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
      while (!this.native_.isEmpty()) {
         rnL_2 var1 = this.native_.remove(0);
         this.f().class_(var1.break_, var1.class_);
      }
   }
}
