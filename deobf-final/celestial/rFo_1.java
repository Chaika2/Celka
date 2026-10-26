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
   private static final Logger protected_ = LogManager.getLogger();
   private long throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   private final String implements_;
   private final String finally_;
   private DatagramSocket extends_;
   private final byte[] native_ = new byte[1460];
   private String volatile_;
   private String final_;
   private final Map<SocketAddress, rFK> package_;
   private final rFU int_;
   private long new_;
   private final rFR continue_;

   private Boolean byte_(DatagramPacket var1) {
      SocketAddress var2 = var1.getSocketAddress();
      if (!this.package_.containsKey(var2)) {
         return false;
      } else {
         byte[] var3 = var1.getData();
         return this.package_.get(var2).class_() == rFa_1.byte_(var3, 7, var1.getLength());
      }
   }

   private rFo_1(rFR var1, int var2) {
      super("Query Listener");
      this.continue_ = var1;
      this.case_ = var2;
      this.final_ = var1.break_();
      this.catch_ = var1.byte_();
      this.implements_ = var1.protected_();
      this.private_ = var1.catch_();
      this.finally_ = var1.implements_();
      this.new_ = 0L;
      this.volatile_ = "0.0.0.0";
      if (!this.final_.isEmpty() && !this.volatile_.equals(this.final_)) {
         this.volatile_ = this.final_;
      } else {
         this.final_ = "0.0.0.0";

         try {
            InetAddress var3 = InetAddress.getLocalHost();
            this.volatile_ = var3.getHostAddress();
         } catch (UnknownHostException var4) {
            protected_.warn("Unable to determine local host IP, please set server-ip in server.properties", var4);
         }
      }

      this.int_ = new rFU(1460);
      this.package_ = Maps.newHashMap();
   }

   @Override
   public void run() {
      protected_.info("Query running on {}:{}", this.final_, this.case_);
      this.throws_ = rqR_2.break_();
      DatagramPacket var1 = new DatagramPacket(this.native_, this.native_.length);

      try {
         while (this.class_) {
            try {
               this.extends_.receive(var1);
               this.protected_();
               this.class_(var1);
            } catch (SocketTimeoutException var8) {
               this.protected_();
            } catch (PortUnreachableException var9) {
            } catch (IOException var10) {
               this.class_(var10);
            }
         }
      } finally {
         protected_.debug("closeSocket: {}:{}", this.final_, this.case_);
         this.extends_.close();
      }
   }

   public static rFo_1 class_(rFR var0) {
      int var1 = var0.class_().super_;
      if (0 < var1 && 65535 >= var1) {
         rFo_1 var2 = new rFo_1(var0, var1);
         return !var2.break_() ? null : var2;
      } else {
         protected_.warn("Invalid query port {} found in server.properties (queries disabled)", var1);
         return null;
      }
   }

   private boolean class_(DatagramPacket var1) throws IOException {
      byte[] var2 = var1.getData();
      int var3 = var1.getLength();
      SocketAddress var4 = var1.getSocketAddress();
      protected_.debug("Packet len {} [{}]", var3, var4);
      if (3 <= var3 && -2 == var2[0] && -3 == var2[1]) {
         protected_.debug("Packet '{}' [{}]", rFa_1.class_(var2[2]), var4);
         switch (var2[2]) {
            case 0:
               if (!this.byte_(var1)) {
                  protected_.debug("Invalid challenge [{}]", var4);
                  return false;
               } else if (15 == var3) {
                  this.class_(this.break_(var1), var1);
                  protected_.debug("Rules [{}]", var4);
               } else {
                  rFU var5 = new rFU(1460);
                  var5.class_(0);
                  var5.class_(this.class_(var1.getSocketAddress()));
                  var5.class_(this.implements_);
                  var5.class_("SMP");
                  var5.class_(this.finally_);
                  var5.class_(Integer.toString(this.continue_.case_()));
                  var5.class_(Integer.toString(this.private_));
                  var5.class_((short)this.catch_);
                  var5.class_(this.volatile_);
                  this.class_(var5.class_(), var1);
                  protected_.debug("Status [{}]", var4);
               }
            default:
               return true;
            case 9:
               this.protected_(var1);
               protected_.debug("Challenge [{}]", var4);
               return true;
         }
      } else {
         protected_.debug("Invalid packet [{}]", var4);
         return false;
      }
   }

   private void class_(Exception var1) {
      if (this.class_) {
         protected_.warn("Unexpected exception", var1);
         if (!this.throws_()) {
            protected_.error("Failed to recover from exception, shutting down!");
            this.class_ = false;
         }
      }
   }

   private byte[] class_(SocketAddress var1) {
      return this.package_.get(var1).byte_();
   }

   private void class_(byte[] var1, DatagramPacket var2) throws IOException {
      this.extends_.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private byte[] break_(DatagramPacket var1) throws IOException {
      long var2 = rqR_2.break_();
      if (var2 < this.new_ + 5000L) {
         byte[] var9 = this.int_.class_();
         byte[] var10 = this.class_(var1.getSocketAddress());
         var9[1] = var10[0];
         var9[2] = var10[1];
         var9[3] = var10[2];
         var9[4] = var10[3];
         return var9;
      } else {
         this.new_ = var2;
         this.int_.break_();
         this.int_.class_(0);
         this.int_.class_(this.class_(var1.getSocketAddress()));
         this.int_.class_("splitnum");
         this.int_.class_(128);
         this.int_.class_(0);
         this.int_.class_("hostname");
         this.int_.class_(this.implements_);
         this.int_.class_("gametype");
         this.int_.class_("SMP");
         this.int_.class_("game_id");
         this.int_.class_("MINECRAFT");
         this.int_.class_("version");
         this.int_.class_(this.continue_.throws_());
         this.int_.class_("plugins");
         this.int_.class_(this.continue_.finally_());
         this.int_.class_("map");
         this.int_.class_(this.finally_);
         this.int_.class_("numplayers");
         this.int_.class_(this.continue_.case_() + "");
         this.int_.class_("maxplayers");
         this.int_.class_(this.private_ + "");
         this.int_.class_("hostport");
         this.int_.class_(this.catch_ + "");
         this.int_.class_("hostip");
         this.int_.class_(this.volatile_);
         this.int_.class_(0);
         this.int_.class_(1);
         this.int_.class_("player_");
         this.int_.class_(0);
         String[] var4 = this.continue_.private_();

         for (String var8 : var4) {
            this.int_.class_(var8);
         }

         this.int_.class_(0);
         return this.int_.class_();
      }
   }

   @Override
   public boolean break_() {
      if (this.class_) {
         return true;
      } else {
         return !this.throws_() ? false : super.break_();
      }
   }

   private boolean throws_() {
      try {
         this.extends_ = new DatagramSocket(this.case_, InetAddress.getByName(this.final_));
         this.extends_.setSoTimeout(500);
         return true;
      } catch (Exception var2) {
         protected_.warn("Unable to initialise query system on {}:{}", this.final_, this.case_, var2);
         return false;
      }
   }

   private void protected_(DatagramPacket var1) throws IOException {
      rFK var2 = new rFK(var1);
      this.package_.put(var1.getSocketAddress(), var2);
      this.class_(var2.break_(), var1);
   }

   private void protected_() {
      if (this.class_) {
         long var1 = rqR_2.break_();
         if (var1 >= this.throws_ + 30000L) {
            this.throws_ = var1;
            this.package_.values().removeIf(var2 -> var2.class_(var1));
         }
      }
   }
}
