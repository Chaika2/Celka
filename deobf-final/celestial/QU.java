package celestial;

import com.mojang.bridge.Bridge;
import com.mojang.bridge.game.GameSession;
import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.game.Language;
import com.mojang.bridge.game.PerformanceMetrics;
import com.mojang.bridge.game.RunningGame;
import com.mojang.bridge.launcher.Launcher;
import com.mojang.bridge.launcher.SessionEventListener;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QU implements RunningGame {
   private static long[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      protected_ = new boolean[1];
   }

   public QU(QY var1) {
      this.throws_();
      SessionEventListener var6 = SessionEventListener.NONE;
      this.class_[2] = var6;
      this.class_[0] = var1;
      Launcher var8 = Bridge.getLauncher();
      this.class_[1] = var8;
      if ((Launcher)this.class_[1] != null) {
         ((Launcher)this.class_[1]).registerGame(this);
      }
   }

   static {
      ntfClinit();
   }

   public void class_() {
      ((SessionEventListener)this.class_[2]).onLeaveGameSession(this.getCurrentSession());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 117, 77, -32, -98, -90, -17, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1976783000349163533L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197122459;
   }

   public GameVersion getVersion() {
      return rqu_3.class_();
   }

   public void break_() {
      ((SessionEventListener)this.class_[2]).onStartGameSession(this.getCurrentSession());
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void catch_() {
      byte_ = new short[]{2, 0, 1, 1, 1, 0, 0, 56, 0, 57, 0, 57, 0, 0, 2, 2, 2};
   }

   private static void case_() {
      break_ = new long[]{2147483647L, -2147483648L, 0L};
   }

   private static void protected_() {
      throws_ = new byte[]{3};
   }

   public void setSessionEventListener(SessionEventListener var1) {
      this.class_[2] = var1;
   }

   public Language getSelectedLanguage() {
      return ((QY)this.class_[0]).u().break_();
   }

   public PerformanceMetrics getPerformanceMetrics() {
      rpN_2 var1 = ((QY)this.class_[0]).k();
      long var2 = 2147483647L;
      long var4 = -2147483648L;
      long var6 = 0L;

      for (long var11 : var1.byte_()) {
         var2 = Math.min(var2, var11);
         var4 = Math.max(var4, var11);
         var6 += var11;
      }

      return new Qe_1((int)var2, (int)var4, (int)(var6 / (long)var1.byte_().length), var1.byte_().length);
   }

   public GameSession getCurrentSession() {
      gm_3 var1 = (gm_3)((QY)this.class_[0]).class_[56];
      return var1 == null ? null : new QC(var1, (cb_3)((QY)this.class_[0]).class_[57], (Aq_1)((cb_3)((QY)this.class_[0]).class_[57]).break_[0]);
   }
}
