/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeysiFortuna
 */
public class MemberHome {
    public Member[] getDaftarMember(){
        Member[] daftarMember = null;
        Member tempMember = null;
        ArrayList listMember = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from member";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0; 
            while (rs.next()) {
                tempMember = new Member();
                tempMember.setKodeMember(rs.getString("kodeMember"));
                tempMember.setId(rs.getString("id"));
                tempMember.setPassword(rs.getString("password"));
                tempMember.setNama(rs.getString("nama"));
                tempMember.setJk(rs.getString("jk"));
                tempMember.setTempatLahir(rs.getString("tempatLahir"));
                tempMember.setTglLahir(rs.getString("tglLahir"));
                tempMember.setAlamat(rs.getString("alamat"));
                tempMember.setEmail(rs.getString("email"));
                tempMember.setNoHP(rs.getString("noHP"));
                tempMember.setGambar(rs.getString("gambar"));
                listMember.add(tempMember);
                count++;
            }
            Member.setCount(count);
            daftarMember = new Member[listMember.size()];
            listMember.toArray(daftarMember);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarMember;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }        
    }
    public Member[] getLastDaftarMember(){
        Member[] daftarMember = null;
        Member tempMember = null;
        ArrayList listMember = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from member order by kodeMember desc";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0; 
            while (rs.next()) {
                tempMember = new Member();
                tempMember.setKodeMember(rs.getString("kodeMember"));
                tempMember.setId(rs.getString("id"));
                tempMember.setPassword(rs.getString("password"));
                tempMember.setNama(rs.getString("nama"));
                tempMember.setJk(rs.getString("jk"));
                tempMember.setTempatLahir(rs.getString("tempatLahir"));
                tempMember.setTglLahir(rs.getString("tglLahir"));
                tempMember.setAlamat(rs.getString("alamat"));
                tempMember.setEmail(rs.getString("email"));
                tempMember.setNoHP(rs.getString("noHP"));
                tempMember.setGambar(rs.getString("gambar"));
                listMember.add(tempMember);
                count++;
            }
            Member.setCount(count);
            daftarMember = new Member[listMember.size()];
            listMember.toArray(daftarMember);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarMember;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }        
    }
    public boolean create(Member dataMember) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into member values("
                    + "'"+dataMember.getKodeMember()+"',"
                    + "'"+dataMember.getId()+"',"
                    + "'"+dataMember.getPassword()+"',"
                    + "'"+dataMember.getNama()+"',"
                    + "'"+dataMember.getJk()+"',"
                    + "'"+dataMember.getTempatLahir()+"',"
                    + "'"+dataMember.getTglLahir()+"',"
                    + "'"+dataMember.getAlamat()+"',"
                    + "'"+dataMember.getEmail()+"',"
                    + "'"+dataMember.getNoHP()+"',"
                    + "'"+dataMember.getGambar()+"')";
            
            String nomor = "insert into nomember select count(*)+1 from nomember";
            akses.connect();
            akses.executeUpdate(insert);
            akses.executeUpdate(nomor);
            akses.disconnect();
            return true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            return false;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public Member getDaftarMemberByKode(String kodeMember){
        Member member = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from member where kodeMember='"+kodeMember+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                member = new Member();
                member.setKodeMember(rs.getString("kodeMember"));
                member.setId(rs.getString("id"));
                member.setPassword(rs.getString("password"));
                member.setNama(rs.getString("nama"));
                member.setJk(rs.getString("jk"));
                member.setTempatLahir(rs.getString("tempatLahir"));
                member.setTglLahir(rs.getString("tglLahir"));
                member.setAlamat(rs.getString("alamat"));
                member.setEmail(rs.getString("email"));
                member.setNoHP(rs.getString("noHP"));
                member.setGambar(rs.getString("gambar"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return member;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }        
    }

    public boolean store(Member dataMember){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert ="UPDATE member SET id='"+dataMember.getId()+"',"
                    +"password='"+dataMember.getPassword()+"',"
                    +"nama='"+dataMember.getNama()+"',"
                    +"jk='"+dataMember.getJk()+"',"
                    +"tempatLahir='"+dataMember.getTempatLahir()+"',"
                    +"tglLahir='"+dataMember.getTglLahir()+"',"
                    +"alamat='"+dataMember.getAlamat()+"',"
                    +"email='"+dataMember.getEmail()+"',"
                    +"noHP='"+dataMember.getNoHP()+"',"
                    +"gambar='"+dataMember.getGambar()+"' WHERE kodeMember='"+dataMember.getKodeMember()+"';";
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if(baris > 0) sukses=true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    }
    
    public boolean delete(String kodeMember){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from member where kodeMember='"+kodeMember+"'";
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if(baris > 0) sukses=true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    }
}
