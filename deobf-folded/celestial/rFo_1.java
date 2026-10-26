package celestial;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFo_1 extends rFe_1 {
   private static final Logger id_protected = LogManager.getLogger();
   private long id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;
   private final String id_implements;
   private final String id_finally;
   private DatagramSocket id_extends;
   private final byte[] id_native = new byte[1460];
   private String id_volatile;
   private String id_final;
   private final Map<SocketAddress, rFK> id_package;
   private final rFU id_int;
   private long id_new;
   private final rFR id_continue;

   private Boolean id_byte(DatagramPacket var1) {
      SocketAddress var2 = var1.getSocketAddress();
      if (!this.id_package.containsKey(var2)) {
         return false;
      } else {
         byte[] var3 = var1.getData();
         return this.id_package.get(var2).id_class() == rFa_1.id_byte(var3, 7, var1.getLength());
      }
   }

   private rFo_1(rFR var1, int var2) {
      super("Query Listener");
      this.id_continue = var1;
      this.id_case = var2;
      this.id_final = var1.id_break();
      this.id_catch = var1.id_byte();
      this.id_implements = var1.id_protected();
      this.id_private = var1.id_catch();
      this.id_finally = var1.id_implements();
      this.id_new = 0L;
      this.id_volatile = "0.0.0.0";
      if (!this.id_final.isEmpty() && !this.id_volatile.equals(this.id_final)) {
         this.id_volatile = this.id_final;
      } else {
         this.id_final = "0.0.0.0";

         try {
            InetAddress var3 = InetAddress.getLocalHost();
            this.id_volatile = var3.getHostAddress();
         } catch (UnknownHostException var4) {
            id_protected.warn("Unable to determine local host IP, please set server-ip in server.properties", var4);
         }
      }

      this.id_int = new rFU(1460);
      this.id_package = Maps.newHashMap();
   }

   @Override
   public void run() {
      id_protected.info("Query running on {}:{}", this.id_final, this.id_case);
      this.id_throws = rqR_2.id_break();
      DatagramPacket var1 = new DatagramPacket(this.id_native, this.id_native.length);

      try {
         while (this.id_class) {
            try {
               this.id_extends.receive(var1);
               this.id_protected();
               this.id_class(var1);
            } catch (SocketTimeoutException var8) {
               this.id_protected();
            } catch (PortUnreachableException var9) {
            } catch (IOException var10) {
               this.id_class(var10);
            }
         }
      } finally {
         id_protected.debug("closeSocket: {}:{}", this.id_final, this.id_case);
         this.id_extends.close();
      }
   }

   public static rFo_1 id_class(rFR var0) {
      int var1 = var0.id_class().id_super;
      if (0 < var1 && 65535 >= var1) {
         rFo_1 var2 = new rFo_1(var0, var1);
         return !var2.id_break() ? null : var2;
      } else {
         id_protected.warn("Invalid query port {} found in server.properties (queries disabled)", var1);
         return null;
      }
   }

   private boolean id_class(DatagramPacket var1) throws IOException {
      byte[] var2 = var1.getData();
      int var3 = var1.getLength();
      SocketAddress var4 = var1.getSocketAddress();
      id_protected.debug("Packet len {} [{}]", var3, var4);
      if (3 <= var3 && -2 == var2[0] && -3 == var2[1]) {
         id_protected.debug("Packet '{}' [{}]", rFa_1.id_class(var2[2]), var4);
         switch (var2[2]) {
            case 0:
               if (!this.id_byte(var1)) {
                  id_protected.debug("Invalid challenge [{}]", var4);
                  return false;
               } else if (15 == var3) {
                  this.id_class(this.id_break(var1), var1);
                  id_protected.debug("Rules [{}]", var4);
               } else {
                  rFU var5 = new rFU(1460);
                  var5.id_class(0);
                  var5.id_class(this.id_class(var1.getSocketAddress()));
                  var5.id_class(this.id_implements);
                  var5.id_class("SMP");
                  var5.id_class(this.id_finally);
                  var5.id_class(Integer.toString(this.id_continue.id_case()));
                  var5.id_class(Integer.toString(this.id_private));
                  var5.id_class((short)this.id_catch);
                  var5.id_class(this.id_volatile);
                  this.id_class(var5.id_class(), var1);
                  id_protected.debug("Status [{}]", var4);
               }
            default:
               return true;
            case 9:
               this.id_protected(var1);
               id_protected.debug("Challenge [{}]", var4);
               return true;
         }
      } else {
         id_protected.debug("Invalid packet [{}]", var4);
         return false;
      }
   }

   private void id_class(Exception var1) {
      if (this.id_class) {
         id_protected.warn("Unexpected exception", var1);
         if (!this.id_throws()) {
            id_protected.error("Failed to recover from exception, shutting down!");
            this.id_class = false;
         }
      }
   }

   private byte[] id_class(SocketAddress var1) {
      return this.id_package.get(var1).id_byte();
   }

   private void id_class(byte[] var1, DatagramPacket var2) throws IOException {
      this.id_extends.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private byte[] id_break(DatagramPacket var1) throws IOException {
      long var2 = rqR_2.id_break();
      if (var2 < this.id_new + 5000L) {
         byte[] var9 = this.id_int.id_class();
         byte[] var10 = this.id_class(var1.getSocketAddress());
         var9[1] = var10[0];
         var9[2] = var10[1];
         var9[3] = var10[2];
         var9[4] = var10[3];
         return var9;
      } else {
         this.id_new = var2;
         this.id_int.id_break();
         this.id_int.id_class(0);
         this.id_int.id_class(this.id_class(var1.getSocketAddress()));
         this.id_int.id_class("splitnum");
         this.id_int.id_class(128);
         this.id_int.id_class(0);
         this.id_int.id_class("hostname");
         this.id_int.id_class(this.id_implements);
         this.id_int.id_class("gametype");
         this.id_int.id_class("SMP");
         this.id_int.id_class("game_id");
         this.id_int.id_class("MINECRAFT");
         this.id_int.id_class("version");
         this.id_int.id_class(this.id_continue.id_throws());
         this.id_int.id_class("plugins");
         this.id_int.id_class(this.id_continue.id_finally());
         this.id_int.id_class("map");
         this.id_int.id_class(this.id_finally);
         this.id_int.id_class("numplayers");
         this.id_int.id_class(this.id_continue.id_case() + "");
         this.id_int.id_class("maxplayers");
         this.id_int.id_class(this.id_private + "");
         this.id_int.id_class("hostport");
         this.id_int.id_class(this.id_catch + "");
         this.id_int.id_class("hostip");
         this.id_int.id_class(this.id_volatile);
         this.id_int.id_class(0);
         this.id_int.id_class(1);
         this.id_int.id_class("player_");
         this.id_int.id_class(0);
         String[] var4 = this.id_continue.id_private();

         for (String var8 : var4) {
            this.id_int.id_class(var8);
         }

         this.id_int.id_class(0);
         return this.id_int.id_class();
      }
   }

   @Override
   public boolean id_break() {
      if (this.id_class) {
         return true;
      } else {
         return !this.id_throws() ? false : super.id_break();
      }
   }

   private boolean id_throws() {
      try {
         this.id_extends = new DatagramSocket(this.id_case, InetAddress.getByName(this.id_final));
         this.id_extends.setSoTimeout(500);
         return true;
      } catch (Exception var2) {
         id_protected.warn("Unable to initialise query system on {}:{}", this.id_final, this.id_case, var2);
         return false;
      }
   }

   private void id_protected(DatagramPacket var1) throws IOException {
      rFK var2 = new rFK(var1);
      this.id_package.put(var1.getSocketAddress(), var2);
      this.id_class(var2.id_break(), var1);
   }

   private void id_protected() {
      if (this.id_class) {
         long var1 = rqR_2.id_break();
         if (var1 >= this.id_throws + 30000L) {
            this.id_throws = var1;
            this.id_package.values().removeIf(var2 -> var2.id_class(var1));
         }
      }
   }
}
