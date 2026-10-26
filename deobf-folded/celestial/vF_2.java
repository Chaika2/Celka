package celestial;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vF_2 extends LV<vL_2> {
   static final Logger id_implements = LogManager.getLogger();
   public static final ThreadPoolExecutor id_class = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new rya_3(id_implements)).build()
   );
   public static final rqO_2 id_throws = new rqO_2("textures/misc/unknown_server.png");
   public static final rqO_2 id_case = new rqO_2("textures/gui/server_selection.png");
   static final rgP_2 id_finally = new rgn_3("lanServer.scanning");
   public static final rgP_2 id_catch = new rgn_3("multiplayer.status.cannot_resolve").id_class(rgF_2.DARK_RED);
   public static final rgP_2 id_private = new rgn_3("multiplayer.status.cannot_connect").id_class(rgF_2.DARK_RED);
   static final rgP_2 id_extends = new rgn_3("multiplayer.status.incompatible");
   static final rgP_2 id_return = new rgn_3("multiplayer.status.no_connection");
   static final rgP_2 id_public = new rgn_3("multiplayer.status.pinging");
   private final vG_2 id_goto;
   private final List<vC_2> id_while = Lists.newArrayList();
   private final vL_2 id_try = new vn_3();
   private final List<vA_2> id_instanceof = Lists.newArrayList();

   public vF_2(vG_2 var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_goto = var1;
   }

   public void id_class(vL_2 var1) {
      super.id_class(var1);
      this.id_goto.id_native();
   }

   @Override
   protected boolean id_class() {
      return this.id_goto.id_catch() == this;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      vL_2 var4 = this.id_finally();
      return var4 != null && var4.id_class(var1, var2, var3) || super.id_class(var1, var2, var3);
   }

   public void id_class(AQ var1) {
      this.id_while.clear();

      for (int var2 = 0; var2 < var1.id_byte(); var2++) {
         Ak_1 var3 = var1.id_class(var2);
         this.id_while.add(new vC_2(this, this.id_goto, var3));
      }

      this.id_private();
   }

   public void id_class(List<AZ> var1) {
      this.id_instanceof.clear();

      for (AZ var3 : var1) {
         this.id_instanceof.add(new vA_2(this.id_goto, var3));
      }

      this.id_private();
   }

   @Override
   protected void id_class(Lw_1 var1) {
      this.id_class(var1, var0 -> !(var0 instanceof vn_3));
   }

   @Override
   protected int id_protected() {
      return super.id_protected() + 30;
   }

   private void id_private() {
      this.id_native();
      this.id_while.forEach(var1 -> this.id_break(var1));
      this.id_break(this.id_try);
      this.id_instanceof.forEach(var1 -> this.id_break(var1));
   }

   @Override
   public int F_() {
      return super.F_() + 85;
   }
}
