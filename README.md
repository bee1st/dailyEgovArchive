# dailyEgovArchive (Monorepo)

## Modules
### 1) Web (서비스)
- Path: `dailyEgovArchive-web/`
- Docs: `dailyEgovArchive-web/README.md`
- Features (WIP)
  - 공지사항: 목록/상세/등록/수정/삭제
  - 페이징/검색 (예정)
  - 파일/이미지 업로드 (예정)

### 2) Mng (관리자)
- Path: `dailyEgovArchive-mng/`
- Docs: `dailyEgovArchive-mng/README.md`
- Features (WIP)
  - 관리자용 공지/게시판 관리 (예정)
  - 권한/로그/통계 (예정)

## Branch Strategy
- `main`: PR merge만 반영
- `weekXX-YYYYMMDD`: 주차 단위 작업 브랜치
  - 예: `week01-20260112` (1주차), `week02-20260119` (2주차)

## DB
- PostgreSQL
- DB name: `egovArchive_db`
- Username: `egovArchive`
