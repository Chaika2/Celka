package celestial;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vF_2 extends LV<vL_2> {
   static final Logger implements_ = LogManager.getLogger();
   public static final ThreadPoolExecutor class_ = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new rya_3(implements_)).build()
   );
   public static final rqO_2 throws_ = new rqO_2("textures/misc/unknown_server.png");
   public static final rqO_2 case_ = new rqO_2("textures/gui/server_selection.png");
   static final rgP_2 finally_ = new rgn_3("lanServer.scanning");
   public static final rgP_2 catch_ = new rgn_3("multiplayer.status.cannot_resolve").class_(rgF_2.DARK_RED);
   public static final rgP_2 private_ = new rgn_3("multiplayer.status.cannot_connect").class_(rgF_2.DARK_RED);
   static final rgP_2 extends_ = new rgn_3("multiplayer.status.incompatible");
   static final rgP_2 return_ = new rgn_3("multiplayer.status.no_connection");
   static final rgP_2 public_ = new rgn_3("multiplayer.status.pinging");
   private final vG_2 goto_;
   private final List<vC_2> while_ = Lists.newArrayList();
   private final vL_2 try_ = new vn_3();
   private final List<vA_2> instanceof_ = Lists.newArrayList();

   public vF_2(vG_2 var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.goto_ = var1;
   }

   public void class_(vL_2 var1) {
      super.class_(var1);
      this.goto_.native_();
   }

   @Override
   protected boolean class_() {
      return this.goto_.catch_() == this;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      vL_2 var4 = this.finally_();
      return var4 != null && var4.class_(var1, var2, var3) || super.class_(var1, var2, var3);
   }

   public void class_(AQ var1) {
      this.while_.clear();

      for (int var2 = 0; var2 < var1.byte_(); var2++) {
         Ak_1 var3 = var1.class_(var2);
         this.while_.add(new vC_2(this, this.goto_, var3));
      }

      this.private_();
   }

   public void class_(List<AZ> var1) {
      this.instanceof_.clear();

      for (AZ var3 : var1) {
         this.instanceof_.add(new vA_2(this.goto_, var3));
      }

      this.private_();
   }

   @Override
   protected void class_(Lw_1 var1) {
      this.class_(var1, var0 -> !(var0 instanceof vn_3));
   }

   @Override
   protected int protected_() {
      return super.protected_() + 30;
   }

   private void private_() {
      this.native_();
      this.while_.forEach(var1 -> this.break_(var1));
      this.break_(this.try_);
      this.instanceof_.forEach(var1 -> this.break_(var1));
   }

   @Override
   public int F_() {
      return super.F_() + 85;
   }
}
