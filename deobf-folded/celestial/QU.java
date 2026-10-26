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
   private static long[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_protected = new boolean[1];
   }

   public QU(QY var1) {
      this.id_throws();
      SessionEventListener var6 = SessionEventListener.NONE;
      this.id_class[2] = var6;
      this.id_class[id_byte[1]] = var1;
      Launcher var8 = Bridge.getLauncher();
      this.id_class[1] = var8;
      if ((Launcher)this.id_class[1] != null) {
         ((Launcher)this.id_class[1]).registerGame(this);
      }
   }

   static {
      ntfClinit();
   }

   public void id_class() {
      ((SessionEventListener)this.id_class[2]).onLeaveGameSession(this.getCurrentSession());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 117, 77, -32, -98, -90, -17, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1976783000349163533L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197122459;
   }

   public GameVersion getVersion() {
      return rqu_3.id_class();
   }

   public void id_break() {
      ((SessionEventListener)this.id_class[2]).onStartGameSession(this.getCurrentSession());
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_catch() {
      id_byte = new short[]{2, 0, 1, 1, 1, 0, 0, 56, 0, 57, 0, 57, 0, 0, 2, 2, 2};
   }

   private static void id_case() {
      id_break = new long[]{2147483647L, -2147483648L, 0L};
   }

   private static void id_protected() {
      id_throws = new byte[]{3};
   }

   public void setSessionEventListener(SessionEventListener var1) {
      this.id_class[2] = var1;
   }

   public Language getSelectedLanguage() {
      return ((QY)this.id_class[id_byte[5]]).u().id_break();
   }

   public PerformanceMetrics getPerformanceMetrics() {
      rpN_2 var1 = ((QY)this.id_class[id_byte[13]]).k();
      long var2 = 2147483647L;
      long var4 = -2147483648L;
      long var6 = id_break[2];
      long[] var8 = var1.id_byte();
      int var9 = var8.length;

      for (int var10 = id_protected[0]; var10 < var9; var10++) {
         long var11 = var8[var10];
         var2 = Math.min(var2, var11);
         var4 = Math.max(var4, var11);
         var6 += var11;
      }

      return new Qe_1((int)var2, (int)var4, (int)(var6 / (long)var1.id_byte().length), var1.id_byte().length);
   }

   public GameSession getCurrentSession() {
      gm_3 var1 = (gm_3)((QY)this.id_class[id_byte[6]]).id_class[56];
      return var1 == null
         ? null
         : new QC(var1, (cb_3)((QY)this.id_class[id_byte[8]]).id_class[57], (Aq_1)((cb_3)((QY)this.id_class[id_byte[10]]).id_class[57]).id_break[id_byte[12]]);
   }
}
