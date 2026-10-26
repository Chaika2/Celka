/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rcN_2;
import celestial.rcY_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcg_3;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class rcW_2 {
    public static rcd_3 id_class(DataInput dataInput, rcg_3 rcg_32) throws IOException {
        rcZ_2 rcZ_22 = rcW_2.id_class(dataInput, 0, rcg_32);
        if (rcZ_22 instanceof rcd_3) {
            return (rcd_3)rcZ_22;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static rcd_3 id_class(DataInput dataInput) throws IOException {
        return rcW_2.id_class(dataInput, rcg_3.id_class);
    }

    private static rcZ_2 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        byte by = dataInput.readByte();
        if (by == 0) {
            return rcN_2.id_break;
        }
        dataInput.readUTF();
        try {
            return rcY_2.id_class(by).id_break(dataInput, n, rcg_32);
        }
        catch (IOException iOException) {
            KY kY = KY.id_class(iOException, "Loading NBT data");
            Ko_1 ko_1 = kY.id_class("NBT Tag");
            ko_1.id_class("Tag type", by);
            throw new KU(kY);
        }
    }

    public static void id_class(rcd_3 rcd_32, DataOutput dataOutput) throws IOException {
        rcW_2.id_class((rcZ_2)rcd_32, dataOutput);
    }

    private static void id_class(rcZ_2 rcZ_22, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(rcZ_22.id_class());
        if (rcZ_22.id_class() != 0) {
            dataOutput.writeUTF("");
            rcZ_22.id_class(dataOutput);
        }
    }

    public static rcd_3 id_class(File file) throws IOException {
        rcd_3 rcd_32;
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            rcd_32 = rcW_2.id_class(fileInputStream);
        }
        return rcd_32;
    }

    public static void id_class(rcd_3 rcd_32, File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
            rcW_2.id_class(rcd_32, fileOutputStream);
        }
    }

    public static void id_class(rcd_3 rcd_32, OutputStream outputStream) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            rcW_2.id_class(rcd_32, (DataOutput)dataOutputStream);
        }
    }

    public static rcd_3 id_class(InputStream inputStream) throws IOException {
        rcd_3 rcd_32;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            rcd_32 = rcW_2.id_class(dataInputStream, rcg_3.id_class);
        }
        return rcd_32;
    }

    public static rcd_3 id_break(File file) throws IOException {
        rcd_3 rcd_32;
        if (!file.exists()) {
            return null;
        }
        try (FileInputStream fileInputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(fileInputStream);){
            rcd_32 = rcW_2.id_class(dataInputStream, rcg_3.id_class);
        }
        return rcd_32;
    }

    public static void id_break(rcd_3 rcd_32, File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);){
            rcW_2.id_class(rcd_32, (DataOutput)dataOutputStream);
        }
    }
}

